; FUN_0090ebcc @ 0090ebcc
0090ebcc	stp x22,x21,[sp, #-0x30]!
0090ebd0	stp x20,x19,[sp, #0x10]
0090ebd4	stp x29,x30,[sp, #0x20]
0090ebd8	add x29,sp,#0x20
0090ebdc	mov x19,x0
0090ebe0	ldr x0,[x0, #0xda0]
0090ebe4	mov x21,x1
0090ebe8	bl 0x0090fa8c
0090ebec	mov w20,wzr
0090ebf0	cbz x21,0x0090ec14
0090ebf4	cbz w0,0x0090ec14
0090ebf8	ldr x22,[x19, #0xda0]
0090ebfc	mov x0,x19
0090ec00	ldr w1,[x22, #0x40]
0090ec04	ldr x2,[x22, #0x48]
0090ec08	bl 0x00916af4
0090ec0c	mov w20,w0
0090ec10	str xzr,[x22, #0x48]
0090ec14	ldrb w8,[x19, #0xdb8]
0090ec18	add x22,x19,#0xd90
0090ec1c	orr w8,w8,#0x1
0090ec20	strb w8,[x19, #0xdb8]
0090ec24	cbz x21,0x0090ec30
0090ec28	ldr x8,[x19, #0xd98]
0090ec2c	str x8,[x21]
0090ec30	ldr x8,[x19, #0xd98]
0090ec34	cbnz x8,0x0090ec44
0090ec38	mov x0,x19
0090ec3c	bl 0x0091829c
0090ec40	mov w20,w0
0090ec44	mov x0,x22
0090ec48	bl 0x0090ea5c
0090ec4c	ldr x8,[x19, #0xd98]
0090ec50	cbnz x8,0x0090ec60
0090ec54	ldr x0,[x19, #0x20]
0090ec58	mov w1,#0x1
0090ec5c	bl 0x00908c4c
0090ec60	mov w0,w20
0090ec64	ldp x29,x30,[sp, #0x20]
0090ec68	ldp x20,x19,[sp, #0x10]
0090ec6c	ldp x22,x21,[sp], #0x30
0090ec70	ret
