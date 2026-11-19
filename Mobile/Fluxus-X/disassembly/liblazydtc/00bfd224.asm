; std::__ndk1::ctype_byname<char>::do_toupper @ 00bfd224
00bfd224	bti c
00bfd228	cmp x1,x2
00bfd22c	b.eq 0x00bfd244
00bfd230	sub x8,x2,x1
00bfd234	cmp x8,#0x20
00bfd238	b.cs 0x00bfd24c
00bfd23c	mov x0,x1
00bfd240	b 0x00bfd32c
00bfd244	mov x0,x1
00bfd248	ret
00bfd24c	adrp x10,0x29c000
00bfd250	movi v0.16B,#0x20
00bfd254	adrp x11,0x29c000
00bfd258	adrp x12,0x29d000
00bfd25c	ldr q1,[x10, #0x20]
00bfd260	adrp x10,0x29c000
00bfd264	mvni v2.4S,#0x7a
00bfd268	mvni v3.4S,#0x19
00bfd26c	and x9,x8,#-0x20
00bfd270	ldr q4,[x11, #0xcc0]
00bfd274	ldr q5,[x12, #0xa0]
00bfd278	ldr q6,[x10, #0x890]
00bfd27c	add x0,x1,x9
00bfd280	add x10,x1,#0x10
00bfd284	mov x11,x9
00bfd288	ldp q7,q16,[x10, #-0x10]
00bfd28c	subs x11,x11,#0x20
00bfd290	tbl v17.16B,{v7.16B},v1.16B
00bfd294	tbl v18.16B,{v7.16B},v4.16B
00bfd298	tbl v19.16B,{v7.16B},v5.16B
00bfd29c	tbl v20.16B,{v7.16B},v6.16B
00bfd2a0	tbl v21.16B,{v16.16B},v1.16B
00bfd2a4	tbl v22.16B,{v16.16B},v4.16B
00bfd2a8	tbl v23.16B,{v16.16B},v5.16B
00bfd2ac	tbl v24.16B,{v16.16B},v6.16B
00bfd2b0	add v18.4S,v18.4S,v2.4S
00bfd2b4	add v17.4S,v17.4S,v2.4S
00bfd2b8	add v19.4S,v19.4S,v2.4S
00bfd2bc	add v20.4S,v20.4S,v2.4S
00bfd2c0	add v21.4S,v21.4S,v2.4S
00bfd2c4	add v22.4S,v22.4S,v2.4S
00bfd2c8	add v24.4S,v24.4S,v2.4S
00bfd2cc	add v23.4S,v23.4S,v2.4S
00bfd2d0	cmhi v17.4S,v3.4S,v17.4S
00bfd2d4	cmhi v18.4S,v3.4S,v18.4S
00bfd2d8	cmhi v19.4S,v3.4S,v19.4S
00bfd2dc	cmhi v20.4S,v3.4S,v20.4S
00bfd2e0	cmhi v21.4S,v3.4S,v21.4S
00bfd2e4	cmhi v22.4S,v3.4S,v22.4S
00bfd2e8	cmhi v23.4S,v3.4S,v23.4S
00bfd2ec	cmhi v24.4S,v3.4S,v24.4S
00bfd2f0	uzp1 v17.8H,v18.8H,v17.8H
00bfd2f4	uzp1 v18.8H,v20.8H,v19.8H
00bfd2f8	uzp1 v19.8H,v22.8H,v21.8H
00bfd2fc	uzp1 v20.8H,v24.8H,v23.8H
00bfd300	uzp1 v17.16B,v18.16B,v17.16B
00bfd304	eor v18.16B,v7.16B,v0.16B
00bfd308	uzp1 v19.16B,v20.16B,v19.16B
00bfd30c	eor v20.16B,v16.16B,v0.16B
00bfd310	bif v7.16B,v18.16B,v17.16B
00bfd314	bif v16.16B,v20.16B,v19.16B
00bfd318	stp q7,q16,[x10, #-0x10]
00bfd31c	add x10,x10,#0x20
00bfd320	b.ne 0x00bfd288
00bfd324	cmp x8,x9
00bfd328	b.eq 0x00bfd34c
00bfd32c	ldrb w8,[x0]
00bfd330	sub w9,w8,#0x7b
00bfd334	eor w10,w8,#0x20
00bfd338	cmn w9,#0x1a
00bfd33c	csel w8,w8,w10,cc
00bfd340	strb w8,[x0], #0x1
00bfd344	cmp x0,x2
00bfd348	b.ne 0x00bfd32c
00bfd34c	ret
