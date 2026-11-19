; std::underflow_error::~underflow_error @ 00c0dbb8
00c0dbb8	paciasp
00c0dbbc	stp x29,x30,[sp, #-0x20]!
00c0dbc0	stp x20,x19,[sp, #0x10]
00c0dbc4	mov x29,sp
00c0dbc8	adrp x8,0xcb5000
00c0dbcc	mov x19,x0
00c0dbd0	ldr x8,[x8, #0xb08]
00c0dbd4	ldr x20,[x0, #0x8]
00c0dbd8	add x8,x8,#0x10
00c0dbdc	sub x1,x20,#0x8
00c0dbe0	str x8,[x0]
00c0dbe4	mov w0,#0xffffffff
00c0dbe8	bl 0x00c2bcb0
00c0dbec	cmp w0,#0x1
00c0dbf0	b.pl 0x00c0dbfc
00c0dbf4	sub x0,x20,#0x18
00c0dbf8	bl 0x00c301d0
00c0dbfc	mov x0,x19
00c0dc00	ldp x20,x19,[sp, #0x10]
00c0dc04	ldp x29,x30,[sp], #0x20
00c0dc08	autiasp
00c0dc0c	b 0x00c306f0
