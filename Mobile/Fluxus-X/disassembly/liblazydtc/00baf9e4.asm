; ZSTD_sizeof_DCtx @ 00baf9e4
00baf9e4	cbz x0,0x00bafa24
00baf9e8	stp x29,x30,[sp, #-0x20]!
00baf9ec	str x19,[sp, #0x10]
00baf9f0	mov x29,sp
00baf9f4	ldr x8,[x0, #0x75e8]
00baf9f8	mov x19,x0
00baf9fc	mov x0,x8
00bafa00	bl 0x00c435c0
00bafa04	ldr x8,[x19, #0x7628]
00bafa08	ldr x9,[x19, #0x7648]
00bafa0c	add x8,x8,x9
00bafa10	add x8,x0,x8
00bafa14	add x8,x8,#0x17, LSL #12
00bafa18	add x0,x8,#0x6e8
00bafa1c	ldr x19,[sp, #0x10]
00bafa20	ldp x29,x30,[sp], #0x20
00bafa24	ret
