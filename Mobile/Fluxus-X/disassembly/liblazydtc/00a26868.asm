; ossl_ec_encoding_name2id @ 00a26868
00a26868	str x19,[sp, #-0x20]!
00a2686c	stp x29,x30,[sp, #0x10]
00a26870	add x29,sp,#0x10
00a26874	cbz x0,0x00a268a8
00a26878	adrp x1,0x2bb000
00a2687c	add x1,x1,#0xaaf
00a26880	mov x19,x0
00a26884	bl 0x00c35ee0
00a26888	cbz w0,0x00a268b0
00a2688c	adrp x1,0x2b7000
00a26890	add x1,x1,#0x776
00a26894	mov x0,x19
00a26898	bl 0x00c35ee0
00a2689c	cbz w0,0x00a268b8
00a268a0	mov w0,#0xffffffff
00a268a4	b 0x00a268cc
00a268a8	mov w0,#0x1
00a268ac	b 0x00a268cc
00a268b0	mov x8,xzr
00a268b4	b 0x00a268bc
00a268b8	mov w8,#0x1
00a268bc	adrp x9,0xc5b000
00a268c0	lsl x8,x8,#0x4
00a268c4	add x9,x9,#0x3b8
00a268c8	ldr w0,[x9, x8#0x0]
00a268cc	ldp x29,x30,[sp, #0x10]
00a268d0	ldr x19,[sp], #0x20
00a268d4	ret
