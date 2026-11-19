; FUN_00bf52bc @ 00bf52bc
00bf52bc	paciasp
00bf52c0	stp x29,x30,[sp, #-0x30]!
00bf52c4	stp x22,x21,[sp, #0x10]
00bf52c8	stp x20,x19,[sp, #0x20]
00bf52cc	mov x29,sp
00bf52d0	movi v0.2D,#0x0
00bf52d4	sub x8,x2,#0x1
00bf52d8	adrp x9,0xcad000
00bf52dc	add x9,x9,#0x530
00bf52e0	mov x20,x0
00bf52e4	mov x19,x0
00bf52e8	stp x9,x8,[x0]
00bf52ec	mov w9,#0x1
00bf52f0	mov x8,x0
00bf52f4	str x9,[x0, #0x118]
00bf52f8	add x9,x0,#0x118
00bf52fc	str q0,[x8, #0x28]!
00bf5300	str x8,[x20, #0x10]!
00bf5304	stur q0,[x0, #0x38]
00bf5308	stur q0,[x0, #0x48]
00bf530c	stur q0,[x0, #0x58]
00bf5310	stur q0,[x0, #0x68]
00bf5314	stur q0,[x0, #0x78]
00bf5318	stur q0,[x0, #0x88]
00bf531c	stur q0,[x0, #0x98]
00bf5320	stur q0,[x0, #0xa8]
00bf5324	stur q0,[x0, #0xb8]
00bf5328	stur q0,[x0, #0xc8]
00bf532c	stur q0,[x0, #0xd8]
00bf5330	stur q0,[x0, #0xe8]
00bf5334	stur q0,[x0, #0xf8]
00bf5338	str q0,[x8, #0xe0]
00bf533c	stp x9,x9,[x0, #0x18]
00bf5340	ldrb w8,[x1]
00bf5344	tbnz w8,#0x0,0x00bf535c
00bf5348	ldr x8,[x1, #0x10]
00bf534c	ldr q0,[x1]
00bf5350	str x8,[x19, #0x130]
00bf5354	str q0,[x19, #0x120]
00bf5358	b 0x00bf536c
00bf535c	ldp x2,x8,[x1, #0x8]
00bf5360	add x0,x19,#0x120
00bf5364	mov x1,x8
00bf5368	bl 0x007ff40c
00bf536c	adrp x8,0xd27000
00bf5370	add x8,x8,#0x240
00bf5374	adrp x22,0xd27000
00bf5378	ldarb w8,[x8]
00bf537c	tbz w8,#0x0,0x00bf57f0
00bf5380	ldr x8,[x22, #0x238]
00bf5384	cmp x19,x8
00bf5388	b.eq 0x00bf53a0
00bf538c	ldp x1,x2,[x8, #0x10]
00bf5390	sub x8,x2,x1
00bf5394	asr x3,x8,#0x3
00bf5398	mov x0,x20
00bf539c	bl 0x00c0b578
00bf53a0	ldp x9,x8,[x19, #0x10]
00bf53a4	cmp x8,x9
00bf53a8	b.eq 0x00bf53e8
00bf53ac	mov x10,xzr
00bf53b0	mov w21,#0x1
00bf53b4	b 0x00bf53cc
00bf53b8	mov w10,w21
00bf53bc	sub x11,x8,x9
00bf53c0	add w21,w21,#0x1
00bf53c4	cmp x10,x11, ASR #0x3
00bf53c8	b.cs 0x00bf53e8
00bf53cc	ldr x10,[x9, x10, LSL #0x3]
00bf53d0	cbz x10,0x00bf53b8
00bf53d4	add x1,x10,#0x8
00bf53d8	mov w0,#0x1
00bf53dc	bl 0x00c2bce0
00bf53e0	ldp x9,x8,[x19, #0x10]
00bf53e4	b 0x00bf53b8
00bf53e8	mov w0,#0x18
00bf53ec	bl 0x00c2fed0
00bf53f0	add x1,x19,#0x120
00bf53f4	mov x2,xzr
00bf53f8	mov x21,x0
00bf53fc	bl 0x00c44380
00bf5400	mov x0,x19
00bf5404	mov x1,x21
00bf5408	bl 0x00bf5a30
00bf540c	mov w0,#0x18
00bf5410	bl 0x00c2fed0
00bf5414	add x1,x19,#0x120
00bf5418	mov x2,xzr
00bf541c	mov x21,x0
00bf5420	bl 0x00c44390
00bf5424	mov x0,x19
00bf5428	mov x1,x21
00bf542c	bl 0x00bf5b5c
00bf5430	mov w0,#0x28
00bf5434	bl 0x00c2fed0
00bf5438	add x1,x19,#0x120
00bf543c	mov x2,xzr
00bf5440	mov x21,x0
00bf5444	bl 0x00c443a0
00bf5448	mov x0,x19
00bf544c	mov x1,x21
00bf5450	bl 0x00bf5c88
00bf5454	mov w0,#0x18
00bf5458	bl 0x00c2fed0
00bf545c	add x1,x19,#0x120
00bf5460	mov x2,xzr
00bf5464	mov x21,x0
00bf5468	bl 0x00c443b0
00bf546c	mov x0,x19
00bf5470	mov x1,x21
00bf5474	bl 0x00bf5db4
00bf5478	mov w0,#0x10
00bf547c	bl 0x00c2fed0
00bf5480	mov x1,x0
00bf5484	adrp x8,0xcb5000
00bf5488	mov x9,#-0x1
00bf548c	ldr x8,[x8, #0xd88]
00bf5490	add x8,x8,#0x10
00bf5494	stp x8,x9,[x1]
00bf5498	mov x0,x19
00bf549c	bl 0x00bf5ee0
00bf54a0	mov w0,#0x18
00bf54a4	bl 0x00c2fed0
00bf54a8	ldrb w8,[x19, #0x120]
00bf54ac	ldr x9,[x19, #0x130]
00bf54b0	add x10,x19,#0x121
00bf54b4	mov x21,x0
00bf54b8	tst w8,#0x1
00bf54bc	csel x1,x10,x9,eq
00bf54c0	mov x2,xzr
00bf54c4	bl 0x00c443c0
00bf54c8	adrp x8,0xcb5000
00bf54cc	ldr x8,[x8, #0xd90]
00bf54d0	add x8,x8,#0x10
00bf54d4	str x8,[x21]
00bf54d8	mov x0,x19
00bf54dc	mov x1,x21
00bf54e0	bl 0x00bf600c
00bf54e4	mov w0,#0x10
00bf54e8	bl 0x00c2fed0
00bf54ec	mov x1,x0
00bf54f0	adrp x8,0xcb5000
00bf54f4	mov x9,#-0x1
00bf54f8	ldr x8,[x8, #0xd98]
00bf54fc	add x8,x8,#0x10
00bf5500	stp x8,x9,[x1]
00bf5504	mov x0,x19
00bf5508	bl 0x00bf6138
00bf550c	mov w0,#0x10
00bf5510	bl 0x00c2fed0
00bf5514	mov x1,x0
00bf5518	adrp x8,0xcb5000
00bf551c	mov x9,#-0x1
00bf5520	ldr x8,[x8, #0xda0]
00bf5524	add x8,x8,#0x10
00bf5528	stp x8,x9,[x1]
00bf552c	mov x0,x19
00bf5530	bl 0x00bf6264
00bf5534	mov w0,#0x10
00bf5538	bl 0x00c2fed0
00bf553c	mov x1,x0
00bf5540	adrp x8,0xcb5000
00bf5544	mov x9,#-0x1
00bf5548	ldr x8,[x8, #0xda8]
00bf554c	add x8,x8,#0x10
00bf5550	stp x8,x9,[x1]
00bf5554	mov x0,x19
00bf5558	bl 0x00bf6390
00bf555c	mov w0,#0x10
00bf5560	bl 0x00c2fed0
00bf5564	mov x1,x0
00bf5568	adrp x8,0xcb5000
00bf556c	mov x9,#-0x1
00bf5570	ldr x8,[x8, #0xdb0]
00bf5574	add x8,x8,#0x10
00bf5578	stp x8,x9,[x1]
00bf557c	mov x0,x19
00bf5580	bl 0x00bf64bc
00bf5584	mov w0,#0x30
00bf5588	bl 0x00c2fed0
00bf558c	add x1,x19,#0x120
00bf5590	mov x2,xzr
00bf5594	mov x21,x0
00bf5598	bl 0x00c443d0
00bf559c	mov x0,x19
00bf55a0	mov x1,x21
00bf55a4	bl 0x00bf65e8
00bf55a8	mov w0,#0x30
00bf55ac	bl 0x00c2fed0
00bf55b0	add x1,x19,#0x120
00bf55b4	mov x2,xzr
00bf55b8	mov x21,x0
00bf55bc	bl 0x00c443e0
00bf55c0	mov x0,x19
00bf55c4	mov x1,x21
00bf55c8	bl 0x00bf6714
00bf55cc	mov w0,#0x88
00bf55d0	bl 0x00c2fed0
00bf55d4	add x1,x19,#0x120
00bf55d8	mov x2,xzr
00bf55dc	mov x21,x0
00bf55e0	bl 0x00bf696c
00bf55e4	mov x0,x19
00bf55e8	mov x1,x21
00bf55ec	bl 0x00bf6840
00bf55f0	mov w0,#0x88
00bf55f4	bl 0x00c2fed0
00bf55f8	add x1,x19,#0x120
00bf55fc	mov x2,xzr
00bf5600	mov x21,x0
00bf5604	bl 0x00bf6b9c
00bf5608	mov x0,x19
00bf560c	mov x1,x21
00bf5610	bl 0x00bf6a70
00bf5614	mov w0,#0x88
00bf5618	bl 0x00c2fed0
00bf561c	add x1,x19,#0x120
00bf5620	mov x2,xzr
00bf5624	mov x21,x0
00bf5628	bl 0x00bf6dcc
00bf562c	mov x0,x19
00bf5630	mov x1,x21
00bf5634	bl 0x00bf6ca0
00bf5638	mov w0,#0x88
00bf563c	bl 0x00c2fed0
00bf5640	add x1,x19,#0x120
00bf5644	mov x2,xzr
00bf5648	mov x21,x0
00bf564c	bl 0x00bf6fa4
00bf5650	mov x0,x19
00bf5654	mov x1,x21
00bf5658	bl 0x00bf6e78
00bf565c	mov w0,#0x440
00bf5660	bl 0x00c2fed0
00bf5664	adrp x8,0xcb5000
00bf5668	mov x22,x0
00bf566c	mov x9,#-0x1
00bf5670	ldr x8,[x8, #0xd28]
00bf5674	add x10,x8,#0x10
00bf5678	add x8,x8,#0x70
00bf567c	stp x10,x9,[x0]
00bf5680	str x8,[x0, #0x10]
00bf5684	add x0,x0,#0x18
00bf5688	add x1,x19,#0x120
00bf568c	bl 0x00c443f0
00bf5690	adrp x8,0xcb5000
00bf5694	ldr x8,[x8, #0xdb8]
00bf5698	add x9,x8,#0x10
00bf569c	add x8,x8,#0xa8
00bf56a0	str x9,[x22]
00bf56a4	str x8,[x22, #0x10]
00bf56a8	mov x0,x19
00bf56ac	mov x1,x22
00bf56b0	bl 0x00bf7050
00bf56b4	mov w0,#0x440
00bf56b8	bl 0x00c2fed0
00bf56bc	adrp x8,0xcb5000
00bf56c0	mov x22,x0
00bf56c4	mov x9,#-0x1
00bf56c8	ldr x8,[x8, #0xd38]
00bf56cc	add x10,x8,#0x10
00bf56d0	add x8,x8,#0x70
00bf56d4	stp x10,x9,[x0]
00bf56d8	str x8,[x0, #0x10]
00bf56dc	add x0,x0,#0x18
00bf56e0	add x1,x19,#0x120
00bf56e4	bl 0x00c44400
00bf56e8	adrp x8,0xcb5000
00bf56ec	ldr x8,[x8, #0xdc0]
00bf56f0	add x9,x8,#0x10
00bf56f4	add x8,x8,#0xa8
00bf56f8	str x9,[x22]
00bf56fc	str x8,[x22, #0x10]
00bf5700	mov x0,x19
00bf5704	mov x1,x22
00bf5708	bl 0x00bf717c
00bf570c	mov w0,#0x18
00bf5710	bl 0x00c2fed0
00bf5714	adrp x22,0xcb5000
00bf5718	mov x21,x0
00bf571c	mov x8,#-0x1
00bf5720	ldr x22,[x22, #0xd48]
00bf5724	add x9,x22,#0x10
00bf5728	stp x9,x8,[x0], #0x10
00bf572c	add x1,x19,#0x120
00bf5730	bl 0x00c44410
00bf5734	adrp x8,0xcb5000
00bf5738	ldr x8,[x8, #0xdc8]
00bf573c	add x8,x8,#0x10
00bf5740	str x8,[x21]
00bf5744	mov x0,x19
00bf5748	mov x1,x21
00bf574c	bl 0x00bf72a8
00bf5750	mov w0,#0x18
00bf5754	bl 0x00c2fed0
00bf5758	mov x21,x0
00bf575c	mov x8,#-0x1
00bf5760	add x9,x22,#0x10
00bf5764	stp x9,x8,[x0], #0x10
00bf5768	add x1,x19,#0x120
00bf576c	bl 0x00c44410
00bf5770	adrp x8,0xcb5000
00bf5774	ldr x8,[x8, #0xdd0]
00bf5778	add x8,x8,#0x10
00bf577c	str x8,[x21]
00bf5780	mov x0,x19
00bf5784	mov x1,x21
00bf5788	bl 0x00bf73d4
00bf578c	mov w0,#0x10
00bf5790	bl 0x00c2fed0
00bf5794	mov x1,x0
00bf5798	adrp x8,0xcb5000
00bf579c	mov x9,#-0x1
00bf57a0	ldr x8,[x8, #0xdd8]
00bf57a4	add x8,x8,#0x10
00bf57a8	stp x8,x9,[x1]
00bf57ac	mov x0,x19
00bf57b0	bl 0x00bf7500
00bf57b4	mov w0,#0x10
00bf57b8	bl 0x00c2fed0
00bf57bc	mov x1,x0
00bf57c0	adrp x8,0xcb5000
00bf57c4	mov x9,#-0x1
00bf57c8	ldr x8,[x8, #0xde0]
00bf57cc	add x8,x8,#0x10
00bf57d0	stp x8,x9,[x1]
00bf57d4	mov x0,x19
00bf57d8	bl 0x00bf762c
00bf57dc	ldp x20,x19,[sp, #0x20]
00bf57e0	ldp x22,x21,[sp, #0x10]
00bf57e4	ldp x29,x30,[sp], #0x30
00bf57e8	autiasp
00bf57ec	ret
00bf57f0	adrp x0,0xd27000
00bf57f4	add x0,x0,#0x240
00bf57f8	bl 0x00c2fe90
00bf57fc	cbz w0,0x00bf5380
00bf5800	adrp x21,0xd27000
00bf5804	add x21,x21,#0x100
00bf5808	mov w1,#0x1
00bf580c	mov x0,x21
00bf5810	bl 0x00bf34a8
00bf5814	adrp x0,0xd27000
00bf5818	add x0,x0,#0x240
00bf581c	str x21,[x22, #0x238]
00bf5820	bl 0x00c2fea0
00bf5824	b 0x00bf5380
