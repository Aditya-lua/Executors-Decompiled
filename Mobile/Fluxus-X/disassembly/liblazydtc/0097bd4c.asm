; ix::HttpServer::setOnConnectionCallback @ 0097bd4c
0097bd4c	sub sp,sp,#0x70
0097bd50	str x21,[sp, #0x40]
0097bd54	stp x20,x19,[sp, #0x50]
0097bd58	stp x29,x30,[sp, #0x60]
0097bd5c	add x29,sp,#0x60
0097bd60	mrs x20,tpidr_el0
0097bd64	ldr x8,[x20, #0x28]
0097bd68	add x19,x0,#0x2f0
0097bd6c	stur x8,[x29, #-0x28]
0097bd70	ldr x8,[x1, #0x20]
0097bd74	cbz x8,0x0097bd98
0097bd78	cmp x1,x8
0097bd7c	b.eq 0x0097bda0
0097bd80	ldr x9,[x8]
0097bd84	mov x0,x8
0097bd88	ldr x9,[x9, #0x10]
0097bd8c	blr x9
0097bd90	str x0,[sp, #0x20]
0097bd94	b 0x0097bdbc
0097bd98	str xzr,[sp, #0x20]
0097bd9c	b 0x0097bdbc
0097bda0	mov x9,sp
0097bda4	str x9,[sp, #0x20]
0097bda8	ldr x9,[x8]
0097bdac	mov x1,sp
0097bdb0	mov x0,x8
0097bdb4	ldr x9,[x9, #0x18]
0097bdb8	blr x9
0097bdbc	mov x0,sp
0097bdc0	mov x1,x19
0097bdc4	mov x21,sp
0097bdc8	bl 0x00c33340
0097bdcc	ldr x0,[sp, #0x20]
0097bdd0	cmp x21,x0
0097bdd4	b.eq 0x0097bde8
0097bdd8	cbz x0,0x0097bdf4
0097bddc	ldr x8,[x0]
0097bde0	ldr x8,[x8, #0x28]
0097bde4	b 0x0097bdf0
0097bde8	ldr x8,[x0]
0097bdec	ldr x8,[x8, #0x20]
0097bdf0	blr x8
0097bdf4	ldr x8,[x20, #0x28]
0097bdf8	ldur x9,[x29, #-0x28]
0097bdfc	cmp x8,x9
0097be00	b.ne 0x0097be18
0097be04	ldp x29,x30,[sp, #0x60]
0097be08	ldp x20,x19,[sp, #0x50]
0097be0c	ldr x21,[sp, #0x40]
0097be10	add sp,sp,#0x70
0097be14	ret
0097be18	bl 0x00c2fec0
