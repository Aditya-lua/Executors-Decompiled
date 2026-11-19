; cpr::Session::SetLimitRate @ 008ed0d4
008ed0d4	stp x20,x19,[sp, #-0x20]!
008ed0d8	stp x29,x30,[sp, #0x10]
008ed0dc	add x29,sp,#0x10
008ed0e0	ldr x8,[x0, #0x18]
008ed0e4	mov x20,x0
008ed0e8	ldr x2,[x1]
008ed0ec	mov x19,x1
008ed0f0	ldr x0,[x8]
008ed0f4	mov w1,#0x75c2
008ed0f8	bl 0x00c317c0
008ed0fc	ldr x8,[x20, #0x18]
008ed100	ldr x2,[x19, #0x8]
008ed104	ldp x29,x30,[sp, #0x10]
008ed108	mov w1,#0x75c1
008ed10c	ldr x0,[x8]
008ed110	ldp x20,x19,[sp], #0x20
008ed114	b 0x00c317c0
