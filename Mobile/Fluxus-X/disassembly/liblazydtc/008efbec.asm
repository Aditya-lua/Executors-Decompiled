; cpr::Session::PrepareDownload @ 008efbec
008efbec	stp x20,x19,[sp, #-0x20]!
008efbf0	stp x29,x30,[sp, #0x10]
008efbf4	add x29,sp,#0x10
008efbf8	ldr x8,[x0, #0x18]
008efbfc	mov x19,x0
008efc00	mov x20,x1
008efc04	mov w1,#0x2c
008efc08	ldr x0,[x8]
008efc0c	mov x2,xzr
008efc10	bl 0x00c317c0
008efc14	ldr x8,[x19, #0x18]
008efc18	mov w1,#0x50
008efc1c	mov w2,#0x1
008efc20	ldr x0,[x8]
008efc24	bl 0x00c317c0
008efc28	ldr x8,[x19, #0x18]
008efc2c	mov w1,#0x2734
008efc30	mov x2,xzr
008efc34	ldr x0,[x8]
008efc38	bl 0x00c317c0
008efc3c	mov x0,x19
008efc40	mov x1,x20
008efc44	bl 0x00c312c0
008efc48	ldp x29,x30,[sp, #0x10]
008efc4c	mov x0,x19
008efc50	ldp x20,x19,[sp], #0x20
008efc54	b 0x00c31310
