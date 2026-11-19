; FUN_0098db04 @ 0098db04
0098db04	str x23,[sp, #-0x40]!
0098db08	stp x22,x21,[sp, #0x10]
0098db0c	stp x20,x19,[sp, #0x20]
0098db10	stp x29,x30,[sp, #0x30]
0098db14	add x29,sp,#0x30
0098db18	mov x20,x0
0098db1c	mov w0,#0x8
0098db20	mov x22,x2
0098db24	mov x23,x1
0098db28	bl 0x00c2fed0
0098db2c	mov x21,x0
0098db30	bl 0x00c2ffa0
0098db34	mov w0,#0x20
0098db38	bl 0x00c2fed0
0098db3c	ldp x8,x9,[x23]
0098db40	ldr x10,[x22]
0098db44	mov x19,x0
0098db48	stp x21,x8,[x0]
0098db4c	stp x9,x10,[x0, #0x10]
0098db50	adrp x2,0xcb5000
0098db54	ldr x2,[x2, #0x50]
0098db58	mov x0,x20
0098db5c	mov x1,xzr
0098db60	mov x3,x19
0098db64	bl 0x00c2ffb0
0098db68	cbnz w0,0x0098db80
0098db6c	ldp x29,x30,[sp, #0x30]
0098db70	ldp x20,x19,[sp, #0x20]
0098db74	ldp x22,x21,[sp, #0x10]
0098db78	ldr x23,[sp], #0x40
0098db7c	ret
0098db80	adrp x1,0x2a7000
0098db84	add x1,x1,#0x22
0098db88	bl 0x00c2ffc0
