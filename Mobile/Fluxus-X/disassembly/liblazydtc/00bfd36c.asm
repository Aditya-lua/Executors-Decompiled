; std::__ndk1::ctype_byname<char>::do_tolower @ 00bfd36c
00bfd36c	bti c
00bfd370	cmp x1,x2
00bfd374	b.eq 0x00bfd38c
00bfd378	sub x8,x2,x1
00bfd37c	cmp x8,#0x20
00bfd380	b.cs 0x00bfd394
00bfd384	mov x0,x1
00bfd388	b 0x00bfd474
00bfd38c	mov x0,x1
00bfd390	ret
00bfd394	adrp x10,0x29c000
00bfd398	movi v0.16B,#0x20
00bfd39c	adrp x11,0x29c000
00bfd3a0	adrp x12,0x29d000
00bfd3a4	ldr q1,[x10, #0x20]
00bfd3a8	adrp x10,0x29c000
00bfd3ac	mvni v2.4S,#0x5a
00bfd3b0	mvni v3.4S,#0x19
00bfd3b4	and x9,x8,#-0x20
00bfd3b8	ldr q4,[x11, #0xcc0]
00bfd3bc	ldr q5,[x12, #0xa0]
00bfd3c0	ldr q6,[x10, #0x890]
00bfd3c4	add x0,x1,x9
00bfd3c8	add x10,x1,#0x10
00bfd3cc	mov x11,x9
00bfd3d0	ldp q7,q16,[x10, #-0x10]
00bfd3d4	subs x11,x11,#0x20
00bfd3d8	tbl v17.16B,{v7.16B},v1.16B
00bfd3dc	tbl v18.16B,{v7.16B},v4.16B
00bfd3e0	tbl v19.16B,{v7.16B},v5.16B
00bfd3e4	tbl v20.16B,{v7.16B},v6.16B
00bfd3e8	tbl v21.16B,{v16.16B},v1.16B
00bfd3ec	tbl v22.16B,{v16.16B},v4.16B
00bfd3f0	tbl v23.16B,{v16.16B},v5.16B
00bfd3f4	tbl v24.16B,{v16.16B},v6.16B
00bfd3f8	add v18.4S,v18.4S,v2.4S
00bfd3fc	add v17.4S,v17.4S,v2.4S
00bfd400	add v19.4S,v19.4S,v2.4S
00bfd404	add v20.4S,v20.4S,v2.4S
00bfd408	add v21.4S,v21.4S,v2.4S
00bfd40c	add v22.4S,v22.4S,v2.4S
00bfd410	add v24.4S,v24.4S,v2.4S
00bfd414	add v23.4S,v23.4S,v2.4S
00bfd418	cmhi v17.4S,v3.4S,v17.4S
00bfd41c	cmhi v18.4S,v3.4S,v18.4S
00bfd420	cmhi v19.4S,v3.4S,v19.4S
00bfd424	cmhi v20.4S,v3.4S,v20.4S
00bfd428	cmhi v21.4S,v3.4S,v21.4S
00bfd42c	cmhi v22.4S,v3.4S,v22.4S
00bfd430	cmhi v23.4S,v3.4S,v23.4S
00bfd434	cmhi v24.4S,v3.4S,v24.4S
00bfd438	uzp1 v17.8H,v18.8H,v17.8H
00bfd43c	uzp1 v18.8H,v20.8H,v19.8H
00bfd440	uzp1 v19.8H,v22.8H,v21.8H
00bfd444	uzp1 v20.8H,v24.8H,v23.8H
00bfd448	uzp1 v17.16B,v18.16B,v17.16B
00bfd44c	orr v18.16B,v7.16B,v0.16B
00bfd450	uzp1 v19.16B,v20.16B,v19.16B
00bfd454	orr v20.16B,v16.16B,v0.16B
00bfd458	bif v7.16B,v18.16B,v17.16B
00bfd45c	bif v16.16B,v20.16B,v19.16B
00bfd460	stp q7,q16,[x10, #-0x10]
00bfd464	add x10,x10,#0x20
00bfd468	b.ne 0x00bfd3d0
00bfd46c	cmp x8,x9
00bfd470	b.eq 0x00bfd494
00bfd474	ldrb w8,[x0]
00bfd478	sub w9,w8,#0x5b
00bfd47c	orr w10,w8,#0x20
00bfd480	cmn w9,#0x1a
00bfd484	csel w8,w8,w10,cc
00bfd488	strb w8,[x0], #0x1
00bfd48c	cmp x0,x2
00bfd490	b.ne 0x00bfd474
00bfd494	ret
