; SHA256_Update @ 00adf9cc
00adf9cc	str x23,[sp, #-0x40]!
00adf9d0	stp x22,x21,[sp, #0x10]
00adf9d4	stp x20,x19,[sp, #0x20]
00adf9d8	stp x29,x30,[sp, #0x30]
00adf9dc	add x29,sp,#0x30
00adf9e0	cbz x2,0x00adfac0
00adf9e4	ldp w8,w9,[x0, #0x20]
00adf9e8	mov x19,x2
00adf9ec	mov x21,x1
00adf9f0	mov x20,x0
00adf9f4	adds w8,w8,w19, LSL #0x3
00adf9f8	b.cc 0x00adfa04
00adf9fc	add w9,w9,#0x1
00adfa00	str w9,[x20, #0x24]
00adfa04	ldr w10,[x20, #0x68]
00adfa08	lsr x11,x19,#0x1d
00adfa0c	add w9,w9,w11
00adfa10	stp w8,w9,[x20, #0x20]
00adfa14	cbz w10,0x00adfa6c
00adfa18	add x8,x10,x19
00adfa1c	add x22,x20,#0x28
00adfa20	orr x8,x8,x19
00adfa24	cmp x8,#0x40
00adfa28	add x0,x22,x10
00adfa2c	b.cc 0x00adfaa8
00adfa30	mov w8,#0x40
00adfa34	sub x23,x8,x10
00adfa38	mov x1,x21
00adfa3c	mov x2,x23
00adfa40	bl 0x00c2ffd0
00adfa44	mov w2,#0x1
00adfa48	mov x0,x20
00adfa4c	mov x1,x22
00adfa50	bl 0x00adfe04
00adfa54	mov w2,#0x44
00adfa58	mov x0,x22
00adfa5c	mov w1,wzr
00adfa60	add x21,x21,x23
00adfa64	sub x19,x19,x23
00adfa68	bl 0x00c301c0
00adfa6c	lsr x2,x19,#0x6
00adfa70	cbz x2,0x00adfa8c
00adfa74	mov x0,x20
00adfa78	mov x1,x21
00adfa7c	bl 0x00adfe04
00adfa80	and x8,x19,#-0x40
00adfa84	add x21,x21,x8
00adfa88	sub x19,x19,x8
00adfa8c	cbz x19,0x00adfac0
00adfa90	add x0,x20,#0x28
00adfa94	mov x1,x21
00adfa98	mov x2,x19
00adfa9c	str w19,[x20, #0x68]
00adfaa0	bl 0x00c2ffd0
00adfaa4	b 0x00adfac0
00adfaa8	mov x1,x21
00adfaac	mov x2,x19
00adfab0	bl 0x00c2ffd0
00adfab4	ldr w8,[x20, #0x68]
00adfab8	add w8,w8,w19
00adfabc	str w8,[x20, #0x68]
00adfac0	ldp x29,x30,[sp, #0x30]
00adfac4	ldp x20,x19,[sp, #0x20]
00adfac8	ldp x22,x21,[sp, #0x10]
00adfacc	mov w0,#0x1
00adfad0	ldr x23,[sp], #0x40
00adfad4	ret
