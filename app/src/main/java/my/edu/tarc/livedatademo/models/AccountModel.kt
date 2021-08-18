package my.edu.tarc.livedatademo.models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData

class AccountModel(accNo:String, owner:String, balance:Double) :ViewModel(){
    var accNo : String = ""
    var owner : String = ""
    private var _balance = MutableLiveData<Double>()

    val balance : LiveData<Double>
                    get() = _balance

    init {
        this.accNo = accNo
        this.owner = owner
        this._balance.value = balance
    }

    fun deposit(amount: Double) {
        _balance.value = (_balance.value)?.plus(amount)
    }

    fun withdraw(amount:Double){
        _balance.value = (_balance.value)?.minus(amount)

    }

}