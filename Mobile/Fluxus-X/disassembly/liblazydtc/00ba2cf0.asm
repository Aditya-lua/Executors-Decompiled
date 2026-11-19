; psa_initialize_key_slots @ 00ba2cf0
00ba2cf0	stp x29,x30,[sp, #-0x10]!
00ba2cf4	mov x29,sp
00ba2cf8	mov w0,#0x20
00ba2cfc	orr w1,wzr,#0x38
00ba2d00	bl 0x00c30a30
00ba2d04	adrp x8,0xd26000
00ba2d08	add x8,x8,#0x28
00ba2d0c	str x0,[x8, #0xb0]
00ba2d10	cbz x0,0x00ba2d2c
00ba2d14	adrp x8,0xd26000
00ba2d18	mov w9,#0x1
00ba2d1c	mov w0,wzr
00ba2d20	strb w9,[x8, #0x190]
00ba2d24	ldp x29,x30,[sp], #0x10
00ba2d28	ret
00ba2d2c	mov w0,#0xffffff73
00ba2d30	ldp x29,x30,[sp], #0x10
00ba2d34	ret
