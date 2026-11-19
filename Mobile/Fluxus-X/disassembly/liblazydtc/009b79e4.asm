; SSL_get_server_random @ 009b79e4
009b79e4	str x19,[sp, #-0x20]!
009b79e8	stp x29,x30,[sp, #0x10]
009b79ec	add x29,sp,#0x10
009b79f0	cbz x2,0x009b7a18
009b79f4	cmp x2,#0x20
009b79f8	mov w8,#0x20
009b79fc	csel x19,x2,x8,cc
009b7a00	add x8,x0,#0x140
009b7a04	mov x0,x1
009b7a08	mov x1,x8
009b7a0c	mov x2,x19
009b7a10	bl 0x00c2ffd0
009b7a14	b 0x009b7a1c
009b7a18	mov w19,#0x20
009b7a1c	ldp x29,x30,[sp, #0x10]
009b7a20	mov x0,x19
009b7a24	ldr x19,[sp], #0x20
009b7a28	ret
