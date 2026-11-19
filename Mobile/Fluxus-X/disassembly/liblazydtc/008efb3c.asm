; cpr::Session::Download @ 008efb3c
008efb3c	str x21,[sp, #-0x30]!
008efb40	stp x20,x19,[sp, #0x10]
008efb44	stp x29,x30,[sp, #0x20]
008efb48	add x29,sp,#0x20
008efb4c	ldr x9,[x0, #0x18]
008efb50	mov x19,x0
008efb54	mov x21,x1
008efb58	mov w1,#0x2c
008efb5c	ldr x0,[x9]
008efb60	mov x2,xzr
008efb64	mov x20,x8
008efb68	bl 0x00c317c0
008efb6c	ldr x8,[x19, #0x18]
008efb70	mov w1,#0x50
008efb74	mov w2,#0x1
008efb78	ldr x0,[x8]
008efb7c	bl 0x00c317c0
008efb80	ldr x8,[x19, #0x18]
008efb84	mov w1,#0x2734
008efb88	mov x2,xzr
008efb8c	ldr x0,[x8]
008efb90	bl 0x00c317c0
008efb94	mov x0,x19
008efb98	mov x1,x21
008efb9c	bl 0x00c312c0
008efba0	mov x0,x19
008efba4	bl 0x00c31310
008efba8	ldr x8,[x19, #0x2a0]
008efbac	cbz x8,0x008efbc8
008efbb0	mov x8,x20
008efbb4	mov x0,x19
008efbb8	ldp x29,x30,[sp, #0x20]
008efbbc	ldp x20,x19,[sp, #0x10]
008efbc0	ldr x21,[sp], #0x30
008efbc4	b 0x00c313b0
008efbc8	mov x0,x19
008efbcc	bl 0x00c31250
008efbd0	mov w1,w0
008efbd4	mov x8,x20
008efbd8	mov x0,x19
008efbdc	ldp x29,x30,[sp, #0x20]
008efbe0	ldp x20,x19,[sp, #0x10]
008efbe4	ldr x21,[sp], #0x30
008efbe8	b 0x00c312a0
