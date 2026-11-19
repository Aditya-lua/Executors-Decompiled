; psa_crypto_driver_pake_get_user @ 00b8f9e4
00b8f9e4	stp x20,x19,[sp, #-0x20]!
00b8f9e8	stp x29,x30,[sp, #0x10]
00b8f9ec	add x29,sp,#0x10
00b8f9f0	mov x8,x2
00b8f9f4	ldr x2,[x0, #0x18]
00b8f9f8	mov x19,x3
00b8f9fc	mov x20,x0
00b8fa00	cbz x2,0x00b8fa14
00b8fa04	cmp x2,x8
00b8fa08	b.ls 0x00b8fa1c
00b8fa0c	mov w0,#0xffffff76
00b8fa10	b 0x00b8fa38
00b8fa14	mov w0,#0xffffff77
00b8fa18	b 0x00b8fa38
00b8fa1c	ldr x8,[x20, #0x10]
00b8fa20	mov x0,x1
00b8fa24	mov x1,x8
00b8fa28	bl 0x00c2ffd0
00b8fa2c	ldr x8,[x20, #0x18]
00b8fa30	mov w0,wzr
00b8fa34	str x8,[x19]
00b8fa38	ldp x29,x30,[sp, #0x10]
00b8fa3c	ldp x20,x19,[sp], #0x20
00b8fa40	ret
