; FUN_00908b60 @ 00908b60
00908b60	sub sp,sp,#0x50
00908b64	str x21,[sp, #0x20]
00908b68	stp x20,x19,[sp, #0x30]
00908b6c	stp x29,x30,[sp, #0x40]
00908b70	add x29,sp,#0x40
00908b74	mrs x21,tpidr_el0
00908b78	ldr x8,[x21, #0x28]
00908b7c	mov x19,x0
00908b80	mov x20,x1
00908b84	str x8,[sp, #0x18]
00908b88	ldr x9,[x0, #0xc50]
00908b8c	cmn x9,#0x1
00908b90	b.eq 0x00908c00
00908b94	ldr x8,[x19, #0xc8]
00908b98	cbnz x8,0x00908ba4
00908b9c	ldr x10,[x19, #0xc0]
00908ba0	cbz x10,0x00908c00
00908ba4	stp x9,xzr,[sp, #0x8]
00908ba8	ldr x9,[x19, #0xd0]
00908bac	cbz x9,0x00908bb8
00908bb0	ldrb w10,[x9, #0x4]
00908bb4	tbnz w10,#0x5,0x00908bc8
00908bb8	cbnz x8,0x00908bc0
00908bbc	ldr x8,[x19, #0xc0]
00908bc0	add x1,x8,#0x158
00908bc4	b 0x00908bcc
00908bc8	add x1,x9,#0x28
00908bcc	nop
00908bd0	adr x3,0x908c2c
00908bd4	add x2,sp,#0x8
00908bd8	mov x0,x19
00908bdc	bl 0x00910008
00908be0	ldr x8,[sp, #0x10]
00908be4	cbz x8,0x00908bf8
00908be8	cbz x20,0x00908bf0
00908bec	str x8,[x20]
00908bf0	ldr w0,[x8, #0x220]
00908bf4	b 0x00908c04
00908bf8	mov x8,#-0x1
00908bfc	str x8,[x19, #0xc50]
00908c00	mov w0,#0xffffffff
00908c04	ldr x8,[x21, #0x28]
00908c08	ldr x9,[sp, #0x18]
00908c0c	cmp x8,x9
00908c10	b.ne 0x00908c28
00908c14	ldp x29,x30,[sp, #0x40]
00908c18	ldp x20,x19,[sp, #0x30]
00908c1c	ldr x21,[sp, #0x20]
00908c20	add sp,sp,#0x50
00908c24	ret
00908c28	bl 0x00c2fec0
