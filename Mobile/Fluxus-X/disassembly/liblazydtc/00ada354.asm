; ossl_rsa_get_lcm @ 00ada354
00ada354	stp x26,x25,[sp, #-0x50]!
00ada358	stp x24,x23,[sp, #0x10]
00ada35c	stp x22,x21,[sp, #0x20]
00ada360	stp x20,x19,[sp, #0x30]
00ada364	stp x29,x30,[sp, #0x40]
00ada368	add x29,sp,#0x40
00ada36c	mov x19,x7
00ada370	mov x23,x6
00ada374	mov x24,x5
00ada378	mov x20,x4
00ada37c	mov x22,x3
00ada380	mov x25,x2
00ada384	mov x26,x1
00ada388	mov x21,x0
00ada38c	bl 0x00c38de0
00ada390	mov x2,x0
00ada394	mov x0,x24
00ada398	mov x1,x26
00ada39c	bl 0x00c38880
00ada3a0	cbz w0,0x00ada40c
00ada3a4	bl 0x00c38de0
00ada3a8	mov x2,x0
00ada3ac	mov x0,x23
00ada3b0	mov x1,x25
00ada3b4	bl 0x00c38880
00ada3b8	cbz w0,0x00ada40c
00ada3bc	mov x0,x19
00ada3c0	mov x1,x24
00ada3c4	mov x2,x23
00ada3c8	mov x3,x21
00ada3cc	bl 0x00c39060
00ada3d0	cbz w0,0x00ada40c
00ada3d4	mov x0,x20
00ada3d8	mov x1,x24
00ada3dc	mov x2,x23
00ada3e0	mov x3,x21
00ada3e4	bl 0x00c38b10
00ada3e8	cbz w0,0x00ada40c
00ada3ec	mov x0,x22
00ada3f0	mov x1,xzr
00ada3f4	mov x2,x19
00ada3f8	mov x3,x20
00ada3fc	mov x4,x21
00ada400	bl 0x00c38ab0
00ada404	cmp w0,#0x0
00ada408	cset w0,ne
00ada40c	ldp x29,x30,[sp, #0x40]
00ada410	ldp x20,x19,[sp, #0x30]
00ada414	ldp x22,x21,[sp, #0x20]
00ada418	ldp x24,x23,[sp, #0x10]
00ada41c	ldp x26,x25,[sp], #0x50
00ada420	ret
