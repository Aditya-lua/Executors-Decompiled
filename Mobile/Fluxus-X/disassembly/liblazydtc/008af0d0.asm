; FUN_008af0d0 @ 008af0d0
008af0d0	stp x29,x30,[sp, #-0x20]!
008af0d4	stp x20,x19,[sp, #0x10]
008af0d8	mov x29,sp
008af0dc	mov w19,w1
008af0e0	mov x20,x0
008af0e4	bl 0x008ab0e0
008af0e8	cmn w0,#0x1
008af0ec	b.eq 0x008af0fc
008af0f0	ldp x20,x19,[sp, #0x10]
008af0f4	ldp x29,x30,[sp], #0x20
008af0f8	ret
008af0fc	adrp x1,0x2a5000
008af100	add x1,x1,#0x20f
008af104	mov x0,x20
008af108	mov w2,w19
008af10c	bl 0x008aecb4
