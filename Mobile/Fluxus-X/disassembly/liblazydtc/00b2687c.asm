; ossl_siv128_cleanup @ 00b2687c
00b2687c	cbz x0,0x00b268e0
00b26880	str x19,[sp, #-0x20]!
00b26884	stp x29,x30,[sp, #0x10]
00b26888	mov x19,x0
00b2688c	ldr x0,[x0, #0x20]
00b26890	add x29,sp,#0x10
00b26894	bl 0x00c342d0
00b26898	ldr x0,[x19, #0x30]
00b2689c	str xzr,[x19, #0x20]
00b268a0	bl 0x00c36370
00b268a4	ldr x0,[x19, #0x28]
00b268a8	str xzr,[x19, #0x30]
00b268ac	bl 0x00c363c0
00b268b0	mov w1,#0x10
00b268b4	mov x0,x19
00b268b8	str xzr,[x19, #0x28]
00b268bc	bl 0x00c34750
00b268c0	add x0,x19,#0x10
00b268c4	mov w1,#0x10
00b268c8	bl 0x00c34750
00b268cc	adrp x8,0x29a000
00b268d0	ldr d0,[x8, #0xaa0]
00b268d4	str d0,[x19, #0x38]
00b268d8	ldp x29,x30,[sp, #0x10]
00b268dc	ldr x19,[sp], #0x20
00b268e0	mov w0,#0x1
00b268e4	ret
