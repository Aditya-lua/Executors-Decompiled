; EVP_PKEY_paramgen @ 00a747c4
00a747c4	ldr w8,[x0]
00a747c8	cmp w8,#0x2
00a747cc	b.ne 0x00a747d4
00a747d0	b 0x00a744d0
00a747d4	stp x29,x30,[sp, #-0x10]!
00a747d8	mov x29,sp
00a747dc	bl 0x00c342a0
00a747e0	adrp x0,0x2d9000
00a747e4	adrp x2,0x29e000
00a747e8	add x0,x0,#0xd3a
00a747ec	add x2,x2,#0x23d
00a747f0	mov w1,#0x106
00a747f4	bl 0x00c342b0
00a747f8	orr w0,wzr,#0x6
00a747fc	mov w1,#0x97
00a74800	mov x2,xzr
00a74804	bl 0x00c342c0
00a74808	mov w0,#0xffffffff
00a7480c	ldp x29,x30,[sp], #0x10
00a74810	ret
