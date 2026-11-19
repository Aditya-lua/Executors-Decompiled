; OSSL_STORE_INFO_get1_PUBKEY @ 00aea7b4
00aea7b4	str x19,[sp, #-0x20]!
00aea7b8	stp x29,x30,[sp, #0x10]
00aea7bc	ldr w8,[x0]
00aea7c0	add x29,sp,#0x10
00aea7c4	cmp w8,#0x3
00aea7c8	b.ne 0x00aea7e0
00aea7cc	mov x19,x0
00aea7d0	ldr x0,[x0, #0x8]
00aea7d4	bl 0x00c34730
00aea7d8	ldr x0,[x19, #0x8]
00aea7dc	b 0x00aea810
00aea7e0	bl 0x00c342a0
00aea7e4	adrp x0,0x2c2000
00aea7e8	adrp x2,0x29e000
00aea7ec	add x0,x0,#0x3bd
00aea7f0	add x2,x2,#0xa5b
00aea7f4	mov w1,#0x2c7
00aea7f8	bl 0x00c342b0
00aea7fc	mov w0,#0x2c
00aea800	mov w1,#0x7a
00aea804	mov x2,xzr
00aea808	bl 0x00c342c0
00aea80c	mov x0,xzr
00aea810	ldp x29,x30,[sp, #0x10]
00aea814	ldr x19,[sp], #0x20
00aea818	ret
