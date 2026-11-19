; EVP_CipherInit @ 00a5af50
00a5af50	str x23,[sp, #-0x40]!
00a5af54	stp x22,x21,[sp, #0x10]
00a5af58	stp x20,x19,[sp, #0x20]
00a5af5c	mov w19,w4
00a5af60	mov x20,x3
00a5af64	mov x21,x2
00a5af68	mov x22,x1
00a5af6c	mov x23,x0
00a5af70	stp x29,x30,[sp, #0x30]
00a5af74	add x29,sp,#0x30
00a5af78	cbz x1,0x00a5af84
00a5af7c	mov x0,x23
00a5af80	bl 0x00a5a430
00a5af84	mov x1,x22
00a5af88	mov x3,x21
00a5af8c	mov x4,x20
00a5af90	mov w5,w19
00a5af94	ldp x29,x30,[sp, #0x30]
00a5af98	ldp x20,x19,[sp, #0x20]
00a5af9c	ldp x22,x21,[sp, #0x10]
00a5afa0	mov x0,x23
00a5afa4	mov x2,xzr
00a5afa8	mov x6,xzr
00a5afac	ldr x23,[sp], #0x40
00a5afb0	b 0x00a5a64c
