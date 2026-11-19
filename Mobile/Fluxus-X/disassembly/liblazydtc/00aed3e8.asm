; TXT_DB_insert @ 00aed3e8
00aed3e8	str x23,[sp, #-0x40]!
00aed3ec	stp x22,x21,[sp, #0x10]
00aed3f0	stp x20,x19,[sp, #0x20]
00aed3f4	stp x29,x30,[sp, #0x30]
00aed3f8	ldr w8,[x0]
00aed3fc	mov x19,x0
00aed400	mov x20,x1
00aed404	add x29,sp,#0x30
00aed408	cmp w8,#0x1
00aed40c	b.lt 0x00aed4e0
00aed410	mov x21,xzr
00aed414	ldr x8,[x19, #0x10]
00aed418	add x8,x8,x21, LSL #0x3
00aed41c	ldr x9,[x8]
00aed420	cbz x9,0x00aed454
00aed424	ldr x9,[x19, #0x18]
00aed428	ldr x9,[x9, x21, LSL #0x3]
00aed42c	cbz x9,0x00aed444
00aed430	mov x0,x20
00aed434	blr x9
00aed438	cbz w0,0x00aed454
00aed43c	ldr x8,[x19, #0x10]
00aed440	add x8,x8,x21, LSL #0x3
00aed444	ldr x0,[x8]
00aed448	mov x1,x20
00aed44c	bl 0x00c34de0
00aed450	cbnz x0,0x00aed578
00aed454	ldrsw x8,[x19]
00aed458	add x21,x21,#0x1
00aed45c	cmp x21,x8
00aed460	b.lt 0x00aed414
00aed464	cmp w8,#0x0
00aed468	b.le 0x00aed4e0
00aed46c	mov x22,xzr
00aed470	mov x21,xzr
00aed474	ldr x8,[x19, #0x10]
00aed478	ldr x9,[x8, x22#0x0]
00aed47c	cbz x9,0x00aed4c8
00aed480	ldr x9,[x19, #0x18]
00aed484	ldr x9,[x9, x22#0x0]
00aed488	cbz x9,0x00aed4a4
00aed48c	mov x0,x20
00aed490	blr x9
00aed494	cbz w0,0x00aed4c8
00aed498	ldr x8,[x19, #0x10]
00aed49c	add x8,x8,x22
00aed4a0	b 0x00aed4a8
00aed4a4	add x8,x8,x21, LSL #0x3
00aed4a8	ldr x0,[x8]
00aed4ac	mov x1,x20
00aed4b0	bl 0x00c34dc0
00aed4b4	ldr x8,[x19, #0x10]
00aed4b8	mov x1,x20
00aed4bc	ldr x0,[x8, x22#0x0]
00aed4c0	bl 0x00c34de0
00aed4c4	cbz x0,0x00aed4fc
00aed4c8	ldrsw x8,[x19]
00aed4cc	add x21,x21,#0x1
00aed4d0	add x22,x22,#0x8
00aed4d4	cmp x21,x8
00aed4d8	b.lt 0x00aed474
00aed4dc	b 0x00aed4e4
00aed4e0	mov w21,wzr
00aed4e4	ldr x0,[x19, #0x8]
00aed4e8	mov x1,x20
00aed4ec	bl 0x00c347a0
00aed4f0	cbz w0,0x00aed4fc
00aed4f4	mov w0,#0x1
00aed4f8	b 0x00aed590
00aed4fc	mov w8,#0x1
00aed500	cmp w21,#0x1
00aed504	str x8,[x19, #0x20]
00aed508	b.lt 0x00aed570
00aed50c	mov w21,w21
00aed510	lsl x8,x21,#0x3
00aed514	add x22,x21,#0x1
00aed518	sub x23,x8,#0x8
00aed51c	ldr x8,[x19, #0x10]
00aed520	sub x21,x21,#0x1
00aed524	ldr x9,[x8, x23#0x0]
00aed528	cbz x9,0x00aed560
00aed52c	ldr x9,[x19, #0x18]
00aed530	ldr x9,[x9, x23#0x0]
00aed534	cbz x9,0x00aed550
00aed538	mov x0,x20
00aed53c	blr x9
00aed540	cbz w0,0x00aed560
00aed544	ldr x8,[x19, #0x10]
00aed548	add x8,x8,x23
00aed54c	b 0x00aed554
00aed550	add x8,x8,x21, LSL #0x3
00aed554	ldr x0,[x8]
00aed558	mov x1,x20
00aed55c	bl 0x00c36010
00aed560	sub x22,x22,#0x1
00aed564	cmp x22,#0x1
00aed568	sub x23,x23,#0x8
00aed56c	b.gt 0x00aed51c
00aed570	mov w0,wzr
00aed574	b 0x00aed590
00aed578	mov x8,x0
00aed57c	and x9,x21,#0xffffffff
00aed580	mov w10,#0x2
00aed584	mov w0,wzr
00aed588	stp x10,x9,[x19, #0x20]
00aed58c	str x8,[x19, #0x38]
00aed590	ldp x29,x30,[sp, #0x30]
00aed594	ldp x20,x19,[sp, #0x20]
00aed598	ldp x22,x21,[sp, #0x10]
00aed59c	ldr x23,[sp], #0x40
00aed5a0	ret
