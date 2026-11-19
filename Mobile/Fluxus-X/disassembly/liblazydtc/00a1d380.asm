; BN_mod_mul_reciprocal @ 00a1d380
00a1d380	stp x24,x23,[sp, #-0x40]!
00a1d384	stp x22,x21,[sp, #0x10]
00a1d388	mov x21,x0
00a1d38c	mov x0,x4
00a1d390	stp x20,x19,[sp, #0x20]
00a1d394	stp x29,x30,[sp, #0x30]
00a1d398	add x29,sp,#0x30
00a1d39c	mov x19,x4
00a1d3a0	mov x20,x3
00a1d3a4	mov x23,x2
00a1d3a8	mov x24,x1
00a1d3ac	bl 0x00c38a90
00a1d3b0	mov x0,x19
00a1d3b4	bl 0x00c38a40
00a1d3b8	cbz x0,0x00a1d41c
00a1d3bc	cbz x23,0x00a1d3e4
00a1d3c0	mov x22,x0
00a1d3c4	cmp x24,x23
00a1d3c8	b.eq 0x00a1d3ec
00a1d3cc	mov x1,x24
00a1d3d0	mov x2,x23
00a1d3d4	mov x3,x19
00a1d3d8	bl 0x00c39060
00a1d3dc	cbnz w0,0x00a1d3fc
00a1d3e0	b 0x00a1d41c
00a1d3e4	mov x22,x24
00a1d3e8	b 0x00a1d3fc
00a1d3ec	mov x1,x23
00a1d3f0	mov x2,x19
00a1d3f4	bl 0x00c39090
00a1d3f8	cbz w0,0x00a1d41c
00a1d3fc	mov x0,xzr
00a1d400	mov x1,x21
00a1d404	mov x2,x22
00a1d408	mov x3,x20
00a1d40c	mov x4,x19
00a1d410	bl 0x00a1d440
00a1d414	mov w20,w0
00a1d418	b 0x00a1d420
00a1d41c	mov w20,wzr
00a1d420	mov x0,x19
00a1d424	bl 0x00c38a20
00a1d428	mov w0,w20
00a1d42c	ldp x29,x30,[sp, #0x30]
00a1d430	ldp x20,x19,[sp, #0x20]
00a1d434	ldp x22,x21,[sp, #0x10]
00a1d438	ldp x24,x23,[sp], #0x40
00a1d43c	ret
