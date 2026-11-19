; FUN_00b4a2f0 @ 00b4a2f0
00b4a2f0	sub sp,sp,#0xb0
00b4a2f4	stp x22,x21,[sp, #0x80]
00b4a2f8	mov x22,x3
00b4a2fc	mov x3,xzr
00b4a300	stp x28,x27,[sp, #0x50]
00b4a304	stp x26,x25,[sp, #0x60]
00b4a308	stp x24,x23,[sp, #0x70]
00b4a30c	stp x20,x19,[sp, #0x90]
00b4a310	stp x29,x30,[sp, #0xa0]
00b4a314	add x29,sp,#0xa0
00b4a318	mov x24,x6
00b4a31c	mov x20,x5
00b4a320	mov x21,x4
00b4a324	mov x25,x0
00b4a328	bl 0x00c363d0
00b4a32c	cbz w0,0x00b4a434
00b4a330	mov x0,x25
00b4a334	bl 0x00c36380
00b4a338	cbz x0,0x00b4a434
00b4a33c	mov x26,x0
00b4a340	mov x0,x25
00b4a344	bl 0x00c3d780
00b4a348	mov x19,x0
00b4a34c	cbz x0,0x00b4a440
00b4a350	cbz x22,0x00b4a368
00b4a354	mov x0,x19
00b4a358	mov x1,x22
00b4a35c	mov x2,x21
00b4a360	bl 0x00c363e0
00b4a364	cbz w0,0x00b4a440
00b4a368	add x1,sp,#0x10
00b4a36c	add x2,sp,#0x8
00b4a370	mov w3,#0x40
00b4a374	mov x0,x19
00b4a378	bl 0x00c363b0
00b4a37c	cbz w0,0x00b4a440
00b4a380	mov x0,x19
00b4a384	bl 0x00c36370
00b4a388	mov x0,x25
00b4a38c	bl 0x00c3d780
00b4a390	mov x23,x0
00b4a394	cbz x0,0x00b4a438
00b4a398	ldr x2,[sp, #0x8]
00b4a39c	add x1,sp,#0x10
00b4a3a0	mov x0,x23
00b4a3a4	bl 0x00c363e0
00b4a3a8	cbz w0,0x00b4a438
00b4a3ac	cmp x24,x26
00b4a3b0	mov x19,xzr
00b4a3b4	b.ls 0x00b4a3c8
00b4a3b8	mov x0,x23
00b4a3bc	bl 0x00c3d780
00b4a3c0	mov x19,x0
00b4a3c4	cbz x0,0x00b4a444
00b4a3c8	cbz x22,0x00b4a3e0
00b4a3cc	mov x0,x23
00b4a3d0	mov x1,x22
00b4a3d4	mov x2,x21
00b4a3d8	bl 0x00c363e0
00b4a3dc	cbz w0,0x00b4a444
00b4a3e0	subs x28,x24,x26
00b4a3e4	b.ls 0x00b4a488
00b4a3e8	mov x0,x23
00b4a3ec	mov x1,x20
00b4a3f0	mov x2,xzr
00b4a3f4	mov x3,x24
00b4a3f8	bl 0x00c363b0
00b4a3fc	cbz w0,0x00b4a444
00b4a400	mov x0,x23
00b4a404	bl 0x00c36370
00b4a408	add x1,sp,#0x10
00b4a40c	add x2,sp,#0x8
00b4a410	mov w3,#0x40
00b4a414	mov x0,x19
00b4a418	add x20,x20,x26
00b4a41c	bl 0x00c363b0
00b4a420	mov x23,xzr
00b4a424	mov w27,wzr
00b4a428	mov x24,x28
00b4a42c	cbnz w0,0x00b4a380
00b4a430	b 0x00b4a448
00b4a434	mov x23,xzr
00b4a438	mov x19,xzr
00b4a43c	b 0x00b4a444
00b4a440	mov x23,xzr
00b4a444	mov w27,wzr
00b4a448	mov x0,x23
00b4a44c	bl 0x00c36370
00b4a450	mov x0,x19
00b4a454	bl 0x00c36370
00b4a458	add x0,sp,#0x10
00b4a45c	mov w1,#0x40
00b4a460	bl 0x00c34750
00b4a464	mov w0,w27
00b4a468	ldp x29,x30,[sp, #0xa0]
00b4a46c	ldp x20,x19,[sp, #0x90]
00b4a470	ldp x22,x21,[sp, #0x80]
00b4a474	ldp x24,x23,[sp, #0x70]
00b4a478	ldp x26,x25,[sp, #0x60]
00b4a47c	ldp x28,x27,[sp, #0x50]
00b4a480	add sp,sp,#0xb0
00b4a484	ret
00b4a488	add x1,sp,#0x10
00b4a48c	add x2,sp,#0x8
00b4a490	mov w3,#0x40
00b4a494	mov x0,x23
00b4a498	bl 0x00c363b0
00b4a49c	cbz w0,0x00b4a444
00b4a4a0	add x1,sp,#0x10
00b4a4a4	mov x0,x20
00b4a4a8	mov x2,x24
00b4a4ac	bl 0x00c2ffd0
00b4a4b0	mov w27,#0x1
00b4a4b4	b 0x00b4a448
