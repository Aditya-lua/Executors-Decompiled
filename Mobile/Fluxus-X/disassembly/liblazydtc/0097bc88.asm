; ix::HttpServer::setDefaultConnectionCallback @ 0097bc88
0097bc88	sub sp,sp,#0x90
0097bc8c	stp x20,x19,[sp, #0x70]
0097bc90	stp x29,x30,[sp, #0x80]
0097bc94	add x29,sp,#0x80
0097bc98	mrs x19,tpidr_el0
0097bc9c	ldr x9,[x19, #0x28]
0097bca0	adrp x8,0xc51000
0097bca4	add x8,x8,#0xa48
0097bca8	add x8,x8,#0x10
0097bcac	mov x10,sp
0097bcb0	add x20,sp,#0x30
0097bcb4	stur x9,[x29, #-0x18]
0097bcb8	stp x8,x0,[sp]
0097bcbc	stp x8,x0,[sp, #0x30]
0097bcc0	add x1,x0,#0x2f0
0097bcc4	add x0,sp,#0x30
0097bcc8	str x10,[sp, #0x20]
0097bccc	str x20,[sp, #0x50]
0097bcd0	bl 0x00c33340
0097bcd4	ldr x0,[sp, #0x50]
0097bcd8	cmp x20,x0
0097bcdc	b.eq 0x0097bcf0
0097bce0	cbz x0,0x0097bcfc
0097bce4	ldr x8,[x0]
0097bce8	ldr x8,[x8, #0x28]
0097bcec	b 0x0097bcf8
0097bcf0	ldr x8,[x0]
0097bcf4	ldr x8,[x8, #0x20]
0097bcf8	blr x8
0097bcfc	ldr x0,[sp, #0x20]
0097bd00	mov x8,sp
0097bd04	cmp x8,x0
0097bd08	b.eq 0x0097bd1c
0097bd0c	cbz x0,0x0097bd28
0097bd10	ldr x8,[x0]
0097bd14	ldr x8,[x8, #0x28]
0097bd18	b 0x0097bd24
0097bd1c	ldr x8,[x0]
0097bd20	ldr x8,[x8, #0x20]
0097bd24	blr x8
0097bd28	ldr x8,[x19, #0x28]
0097bd2c	ldur x9,[x29, #-0x18]
0097bd30	cmp x8,x9
0097bd34	b.ne 0x0097bd48
0097bd38	ldp x29,x30,[sp, #0x80]
0097bd3c	ldp x20,x19,[sp, #0x70]
0097bd40	add sp,sp,#0x90
0097bd44	ret
0097bd48	bl 0x00c2fec0
