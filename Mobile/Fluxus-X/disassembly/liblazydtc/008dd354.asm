; LZ4_decompress_fast_usingDict @ 008dd354
008dd354	stp x29,x30,[sp, #-0x50]!
008dd358	str x25,[sp, #0x10]
008dd35c	stp x24,x23,[sp, #0x20]
008dd360	stp x22,x21,[sp, #0x30]
008dd364	stp x20,x19,[sp, #0x40]
008dd368	mov x29,sp
008dd36c	mov x21,x1
008dd370	mov x19,x0
008dd374	cbz w4,0x008dd3a8
008dd378	sxtw x4,w4
008dd37c	add x8,x3,x4
008dd380	cmp x8,x21
008dd384	b.eq 0x008dd3ac
008dd388	mov x0,x19
008dd38c	mov x1,x21
008dd390	ldp x20,x19,[sp, #0x40]
008dd394	ldr x25,[sp, #0x10]
008dd398	ldp x22,x21,[sp, #0x30]
008dd39c	ldp x24,x23,[sp, #0x20]
008dd3a0	ldp x29,x30,[sp], #0x50
008dd3a4	b 0x008dbe88
008dd3a8	mov x4,xzr
008dd3ac	add x23,x21,w2, SXTW 
008dd3b0	sub x24,x21,x4
008dd3b4	mov x20,x19
008dd3b8	b 0x008dd3cc
008dd3bc	add x21,x8,x9
008dd3c0	sub x8,x23,x21
008dd3c4	cmp x8,#0x5
008dd3c8	b.cc 0x008dd524
008dd3cc	ldrb w25,[x20], #0x1
008dd3d0	lsr x22,x25,#0x4
008dd3d4	cmp w22,#0xf
008dd3d8	b.ne 0x008dd3f4
008dd3dc	mov x8,xzr
008dd3e0	ldrb w9,[x20], #0x1
008dd3e4	cmp x9,#0xff
008dd3e8	add x8,x8,x9
008dd3ec	b.eq 0x008dd3e0
008dd3f0	add x22,x8,#0xf
008dd3f4	sub x8,x23,x21
008dd3f8	cmp x8,x22
008dd3fc	b.cc 0x008dd524
008dd400	mov x0,x21
008dd404	mov x1,x20
008dd408	mov x2,x22
008dd40c	bl 0x00c2ff60
008dd410	add x8,x21,x22
008dd414	add x20,x20,x22
008dd418	sub x11,x23,x8
008dd41c	cmp x11,#0xb
008dd420	b.ls 0x008dd51c
008dd424	and x10,x25,#0xf
008dd428	ldrh w13,[x20], #0x2
008dd42c	cmp w10,#0xf
008dd430	b.ne 0x008dd44c
008dd434	mov x9,xzr
008dd438	ldrb w10,[x20], #0x1
008dd43c	cmp x10,#0xff
008dd440	add x9,x9,x10
008dd444	b.eq 0x008dd438
008dd448	add x10,x9,#0xf
008dd44c	add x9,x10,#0x4
008dd450	sub x12,x8,x24
008dd454	cmp x11,x9
008dd458	ccmp x12,x13,#0x0,cs
008dd45c	b.cc 0x008dd524
008dd460	cbz x9,0x008dd3bc
008dd464	mov x12,xzr
008dd468	cmp x9,#0x8
008dd46c	neg x11,x13
008dd470	b.cc 0x008dd4f8
008dd474	cmp w13,#0x20
008dd478	b.cc 0x008dd4f8
008dd47c	cmp x9,#0x20
008dd480	b.cs 0x008dd48c
008dd484	mov x12,xzr
008dd488	b 0x008dd4cc
008dd48c	and x12,x9,#-0x20
008dd490	add x14,x21,#0x10
008dd494	sub x13,x22,x13
008dd498	add x13,x14,x13
008dd49c	add x14,x14,x22
008dd4a0	mov x15,x12
008dd4a4	ldp q0,q1,[x13, #-0x10]
008dd4a8	subs x15,x15,#0x20
008dd4ac	add x13,x13,#0x20
008dd4b0	stp q0,q1,[x14, #-0x10]
008dd4b4	add x14,x14,#0x20
008dd4b8	b.ne 0x008dd4a4
008dd4bc	cmp x9,x12
008dd4c0	b.eq 0x008dd3bc
008dd4c4	tst x9,#0x18
008dd4c8	b.eq 0x008dd4f8
008dd4cc	mov x14,x12
008dd4d0	and x12,x9,#-0x8
008dd4d4	add x13,x14,x22
008dd4d8	sub x14,x14,x12
008dd4dc	add x13,x21,x13
008dd4e0	ldr d0,[x13,x11]
008dd4e4	adds x14,x14,#0x8
008dd4e8	str d0,[x13], #0x8
008dd4ec	b.ne 0x008dd4e0
008dd4f0	cmp x9,x12
008dd4f4	b.eq 0x008dd3bc
008dd4f8	add x13,x12,x22
008dd4fc	sub x12,x10,x12
008dd500	add x10,x21,x13
008dd504	add x12,x12,#0x4
008dd508	ldrb w13,[x10, x11]
008dd50c	subs x12,x12,#0x1
008dd510	strb w13,[x10], #0x1
008dd514	b.ne 0x008dd508
008dd518	b 0x008dd3bc
008dd51c	cmp x8,x23
008dd520	b.eq 0x008dd540
008dd524	mov w0,#0xffffffff
008dd528	ldp x20,x19,[sp, #0x40]
008dd52c	ldr x25,[sp, #0x10]
008dd530	ldp x22,x21,[sp, #0x30]
008dd534	ldp x24,x23,[sp, #0x20]
008dd538	ldp x29,x30,[sp], #0x50
008dd53c	ret
008dd540	sub w0,w20,w19
008dd544	b 0x008dd528
