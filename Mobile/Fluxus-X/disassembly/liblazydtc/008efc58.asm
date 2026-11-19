; cpr::Session::Download @ 008efc58
008efc58	str x21,[sp, #-0x30]!
008efc5c	stp x20,x19,[sp, #0x10]
008efc60	stp x29,x30,[sp, #0x20]
008efc64	add x29,sp,#0x20
008efc68	ldr x9,[x0, #0x18]
008efc6c	mov x19,x0
008efc70	mov x21,x1
008efc74	mov w1,#0x2c
008efc78	ldr x0,[x9]
008efc7c	mov x2,xzr
008efc80	mov x20,x8
008efc84	bl 0x00c317c0
008efc88	ldr x8,[x19, #0x18]
008efc8c	mov w1,#0x50
008efc90	mov w2,#0x1
008efc94	ldr x0,[x8]
008efc98	bl 0x00c317c0
008efc9c	ldr x8,[x19, #0x18]
008efca0	adrp x2,0xcb4000
008efca4	mov w1,#0x4e2b
008efca8	ldr x0,[x8]
008efcac	ldr x2,[x2, #0xce8]
008efcb0	bl 0x00c317c0
008efcb4	ldr x8,[x19, #0x18]
008efcb8	mov w1,#0x2711
008efcbc	mov x2,x21
008efcc0	ldr x0,[x8]
008efcc4	bl 0x00c317c0
008efcc8	ldr x8,[x19, #0x18]
008efccc	mov w1,#0x2734
008efcd0	mov x2,xzr
008efcd4	ldr x0,[x8]
008efcd8	bl 0x00c317c0
008efcdc	mov x0,x19
008efce0	bl 0x00c31310
008efce4	ldr x8,[x19, #0x2a0]
008efce8	cbz x8,0x008efd04
008efcec	mov x8,x20
008efcf0	mov x0,x19
008efcf4	ldp x29,x30,[sp, #0x20]
008efcf8	ldp x20,x19,[sp, #0x10]
008efcfc	ldr x21,[sp], #0x30
008efd00	b 0x00c313b0
008efd04	mov x0,x19
008efd08	bl 0x00c31250
008efd0c	mov w1,w0
008efd10	mov x8,x20
008efd14	mov x0,x19
008efd18	ldp x29,x30,[sp, #0x20]
008efd1c	ldp x20,x19,[sp, #0x10]
008efd20	ldr x21,[sp], #0x30
008efd24	b 0x00c312a0
