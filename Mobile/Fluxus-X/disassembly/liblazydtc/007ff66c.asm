; FUN_007ff66c @ 007ff66c
007ff66c	sub sp,sp,#0x90
007ff670	stp x29,x30,[sp, #0x30]
007ff674	stp x28,x27,[sp, #0x40]
007ff678	stp x26,x25,[sp, #0x50]
007ff67c	stp x24,x23,[sp, #0x60]
007ff680	stp x22,x21,[sp, #0x70]
007ff684	stp x20,x19,[sp, #0x80]
007ff688	add x29,sp,#0x30
007ff68c	mrs x27,tpidr_el0
007ff690	adrp x28,0xcca000
007ff694	mov w2,#0x6
007ff698	ldr x9,[x27, #0x28]
007ff69c	mov x1,sp
007ff6a0	movk w2,#0x1, LSL #16
007ff6a4	mov x19,x8
007ff6a8	stur x9,[x29, #-0x8]
007ff6ac	ldr x0,[x28, #0xbb8]
007ff6b0	str xzr,[sp]
007ff6b4	ldr x9,[x0]
007ff6b8	ldr x9,[x9, #0x30]
007ff6bc	blr x9
007ff6c0	mov w20,w0
007ff6c4	cbz w0,0x007ff6e4
007ff6c8	ldr x0,[x28, #0xbb8]
007ff6cc	mov x1,sp
007ff6d0	mov x2,xzr
007ff6d4	ldr x8,[x0]
007ff6d8	ldr x8,[x8, #0x20]
007ff6dc	blr x8
007ff6e0	cbnz w0,0x007ffad4
007ff6e4	ldr x21,[sp]
007ff6e8	cbz x21,0x007ffad4
007ff6ec	adrp x23,0xcca000
007ff6f0	ldr x1,[x23, #0xbc0]
007ff6f4	cbz x1,0x007ffad4
007ff6f8	ldr x8,[x21]
007ff6fc	mov x0,x21
007ff700	ldr x8,[x8, #0xf8]
007ff704	blr x8
007ff708	adrp x8,0x2dd000
007ff70c	add x8,x8,#0x3e0
007ff710	mov x22,x0
007ff714	ldr q0,[x8]
007ff718	mov w8,#0xd4b9
007ff71c	movk w8,#0x7bef, LSL #16
007ff720	str q0,[sp]
007ff724	stur w8,[sp, #0xf]
007ff728	adrp x8,0xcca000
007ff72c	add x8,x8,#0xbf0
007ff730	ldarb w8,[x8]
007ff734	tbz w8,#0x0,0x007ffc04
007ff738	adrp x0,0xcca000
007ff73c	add x0,x0,#0xbd8
007ff740	bl 0x008035ac
007ff744	adrp x8,0x2dd000
007ff748	add x8,x8,#0x3f3
007ff74c	ldp q0,q1,[x8]
007ff750	mov w8,#0xefd4
007ff754	movk w8,#0x3740, LSL #16
007ff758	str w8,[sp, #0x20]
007ff75c	adrp x8,0xcca000
007ff760	add x8,x8,#0xc28
007ff764	stp q0,q1,[sp]
007ff768	ldarb w8,[x8]
007ff76c	tbz w8,#0x0,0x007ffc50
007ff770	adrp x8,0xcca000
007ff774	ldrb w8,[x8, #0xc24]
007ff778	cmp w8,#0x1
007ff77c	b.ne 0x007ff7c0
007ff780	adrp x8,0xcca000
007ff784	add x8,x8,#0xc00
007ff788	adrp x9,0x29b000
007ff78c	ldr s0,[x8, #0x20]
007ff790	ldr d1,[x9, #0xba8]
007ff794	adrp x9,0x29c000
007ff798	ldr q2,[x9, #0x870]
007ff79c	strb wzr,[x8, #0x24]
007ff7a0	uxtl v0.8H,v0.8B
007ff7a4	eor v0.8B,v0.8B,v1.8B
007ff7a8	ldp q1,q3,[x8]
007ff7ac	uzp1 v0.8B,v0.8B,v0.8B
007ff7b0	eor v1.16B,v1.16B,v2.16B
007ff7b4	eor v2.16B,v3.16B,v2.16B
007ff7b8	stp q1,q2,[x8]
007ff7bc	str s0,[x8, #0x20]
007ff7c0	ldr x8,[x21]
007ff7c4	adrp x2,0xcca000
007ff7c8	add x2,x2,#0xbd8
007ff7cc	adrp x3,0xcca000
007ff7d0	add x3,x3,#0xc00
007ff7d4	mov x0,x21
007ff7d8	ldr x8,[x8, #0x108]
007ff7dc	mov x1,x22
007ff7e0	blr x8
007ff7e4	ldr x1,[x23, #0xbc0]
007ff7e8	mov x2,x0
007ff7ec	mov x0,x21
007ff7f0	bl 0x007ffe68
007ff7f4	adrp x8,0x2dd000
007ff7f8	add x8,x8,#0x417
007ff7fc	mov x23,x0
007ff800	ldp q0,q1,[x8]
007ff804	mov w8,#0xf1
007ff808	strb w8,[sp, #0x20]
007ff80c	adrp x8,0xcca000
007ff810	add x8,x8,#0xc58
007ff814	stp q0,q1,[sp]
007ff818	ldarb w8,[x8]
007ff81c	tbz w8,#0x0,0x007ffc9c
007ff820	adrp x8,0xcca000
007ff824	ldrb w8,[x8, #0xc51]
007ff828	cmp w8,#0x1
007ff82c	b.ne 0x007ff860
007ff830	adrp x8,0xcca000
007ff834	add x8,x8,#0xc30
007ff838	adrp x9,0x29c000
007ff83c	ldp q1,q2,[x8]
007ff840	ldr q0,[x9, #0xaa0]
007ff844	ldrb w9,[x8, #0x20]
007ff848	strb wzr,[x8, #0x21]
007ff84c	eor v1.16B,v1.16B,v0.16B
007ff850	eor v0.16B,v2.16B,v0.16B
007ff854	eor w9,w9,#0xfffffff1
007ff858	strb w9,[x8, #0x20]
007ff85c	stp q1,q0,[x8]
007ff860	ldr x8,[x21]
007ff864	adrp x1,0xcca000
007ff868	add x1,x1,#0xc30
007ff86c	mov x0,x21
007ff870	ldr x8,[x8, #0x30]
007ff874	blr x8
007ff878	adrp x8,0xcca000
007ff87c	add x8,x8,#0xc70
007ff880	mov x24,x0
007ff884	ldarb w8,[x8]
007ff888	adrp x25,0xcca000
007ff88c	add x25,x25,#0xc60
007ff890	tbz w8,#0x0,0x007ffce8
007ff894	adrp x8,0xcca000
007ff898	ldrb w8,[x8, #0xc6a]
007ff89c	cmp w8,#0x1
007ff8a0	b.ne 0x007ff8d4
007ff8a4	adrp x8,0x29a000
007ff8a8	ldr d0,[x25]
007ff8ac	ldrb w9,[x25, #0x8]
007ff8b0	ldr d1,[x8, #0x7b0]
007ff8b4	ldrb w8,[x25, #0x9]
007ff8b8	strb wzr,[x25, #0xa]
007ff8bc	eor w9,w9,#0xffffff8f
007ff8c0	eor v0.8B,v0.8B,v1.8B
007ff8c4	eor w8,w8,#0xffffffc7
007ff8c8	strb w9,[x25, #0x8]
007ff8cc	strb w8,[x25, #0x9]
007ff8d0	str d0,[x25]
007ff8d4	adrp x8,0xcca000
007ff8d8	add x8,x8,#0xcc8
007ff8dc	ldarb w9,[x8]
007ff8e0	adrp x8,0xcca000
007ff8e4	add x8,x8,#0xc78
007ff8e8	tbz w9,#0x0,0x007ffd3c
007ff8ec	adrp x9,0xcca000
007ff8f0	ldrb w9,[x9, #0xcc0]
007ff8f4	cmp w9,#0x1
007ff8f8	b.ne 0x007ff954
007ff8fc	adrp x9,0x29a000
007ff900	ldp d1,d2,[x8]
007ff904	ldr d0,[x9, #0xa0]
007ff908	ldp d3,d4,[x8, #0x10]
007ff90c	ldp d5,d6,[x8, #0x20]
007ff910	strb wzr,[x8, #0x48]
007ff914	eor v1.8B,v1.8B,v0.8B
007ff918	eor v2.8B,v2.8B,v0.8B
007ff91c	eor v3.8B,v3.8B,v0.8B
007ff920	eor v4.8B,v4.8B,v0.8B
007ff924	eor v6.8B,v6.8B,v0.8B
007ff928	stp d1,d2,[x8]
007ff92c	eor v1.8B,v5.8B,v0.8B
007ff930	ldp d2,d5,[x8, #0x30]
007ff934	stp d3,d4,[x8, #0x10]
007ff938	ldr d3,[x8, #0x40]
007ff93c	stp d1,d6,[x8, #0x20]
007ff940	eor v2.8B,v2.8B,v0.8B
007ff944	eor v4.8B,v5.8B,v0.8B
007ff948	eor v0.8B,v3.8B,v0.8B
007ff94c	stp d2,d4,[x8, #0x30]
007ff950	str d0,[x8, #0x40]
007ff954	ldr x8,[x21]
007ff958	adrp x2,0xcca000
007ff95c	add x2,x2,#0xc60
007ff960	adrp x3,0xcca000
007ff964	add x3,x3,#0xc78
007ff968	mov x0,x21
007ff96c	ldr x8,[x8, #0x388]
007ff970	mov x1,x24
007ff974	blr x8
007ff978	adrp x8,0xcca000
007ff97c	add x8,x8,#0xce0
007ff980	mov x25,x0
007ff984	ldarb w8,[x8]
007ff988	adrp x26,0xcca000
007ff98c	add x26,x26,#0xcd0
007ff990	tbz w8,#0x0,0x007ffda8
007ff994	adrp x8,0xcca000
007ff998	ldrb w8,[x8, #0xcdb]
007ff99c	cmp w8,#0x1
007ff9a0	b.ne 0x007ff9e8
007ff9a4	adrp x9,0x29b000
007ff9a8	ldrb w8,[x26, #0x8]
007ff9ac	ldr d0,[x26]
007ff9b0	ldr d1,[x9, #0x538]
007ff9b4	mov w10,#0x19
007ff9b8	ldrb w9,[x26, #0x9]
007ff9bc	eor w8,w8,w10
007ff9c0	ldrb w10,[x26, #0xa]
007ff9c4	strb wzr,[x26, #0xb]
007ff9c8	eor v0.8B,v0.8B,v1.8B
007ff9cc	strb w8,[x26, #0x8]
007ff9d0	mov w8,#0x51
007ff9d4	eor w9,w9,#0x99999999
007ff9d8	eor w8,w10,w8
007ff9dc	strb w9,[x26, #0x9]
007ff9e0	strb w8,[x26, #0xa]
007ff9e4	str d0,[x26]
007ff9e8	ldr x8,[x21]
007ff9ec	adrp x1,0xcca000
007ff9f0	add x1,x1,#0xcd0
007ff9f4	mov x0,x21
007ff9f8	ldr x8,[x8, #0x538]
007ff9fc	blr x8
007ffa00	mov x26,x0
007ffa04	mov x0,x21
007ffa08	mov x1,x24
007ffa0c	mov x2,x25
007ffa10	mov x3,x23
007ffa14	mov x4,x26
007ffa18	bl 0x007fff04
007ffa1c	stp xzr,xzr,[x19, #0x8]
007ffa20	str xzr,[x19]
007ffa24	cbz x0,0x007ffa80
007ffa28	ldr x8,[x21]
007ffa2c	mov x24,x0
007ffa30	ldr x8,[x8, #0x548]
007ffa34	mov x0,x21
007ffa38	mov x1,x24
007ffa3c	mov x2,xzr
007ffa40	blr x8
007ffa44	mov x25,x0
007ffa48	mov x0,x19
007ffa4c	mov x1,x25
007ffa50	bl 0x0080269c
007ffa54	ldr x8,[x21]
007ffa58	ldr x8,[x8, #0x550]
007ffa5c	mov x0,x21
007ffa60	mov x1,x24
007ffa64	mov x2,x25
007ffa68	blr x8
007ffa6c	ldr x8,[x21]
007ffa70	ldr x8,[x8, #0xb8]
007ffa74	mov x0,x21
007ffa78	mov x1,x24
007ffa7c	blr x8
007ffa80	ldr x8,[x21]
007ffa84	ldr x8,[x8, #0xb8]
007ffa88	mov x0,x21
007ffa8c	mov x1,x26
007ffa90	blr x8
007ffa94	ldr x8,[x21]
007ffa98	ldr x8,[x8, #0xb8]
007ffa9c	mov x0,x21
007ffaa0	mov x1,x23
007ffaa4	blr x8
007ffaa8	ldr x8,[x21]
007ffaac	ldr x8,[x8, #0xb8]
007ffab0	mov x0,x21
007ffab4	mov x1,x22
007ffab8	blr x8
007ffabc	cbz w20,0x007ffb80
007ffac0	ldr x0,[x28, #0xbb8]
007ffac4	ldr x8,[x0]
007ffac8	ldr x8,[x8, #0x28]
007ffacc	blr x8
007ffad0	b 0x007ffb80
007ffad4	adrp x8,0xcca000
007ffad8	add x8,x8,#0xbd0
007ffadc	adrp x20,0xcca000
007ffae0	add x20,x20,#0xbc8
007ffae4	ldarb w8,[x8]
007ffae8	tbz w8,#0x0,0x007ffbb0
007ffaec	adrp x8,0xcca000
007ffaf0	ldrb w8,[x8, #0xbc9]
007ffaf4	cmp w8,#0x1
007ffaf8	b.ne 0x007ffb10
007ffafc	ldrb w8,[x20]
007ffb00	mov w9,#0x27
007ffb04	strb wzr,[x20, #0x1]
007ffb08	eor w8,w8,w9
007ffb0c	strb w8,[x20]
007ffb10	adrp x0,0xcca000
007ffb14	add x0,x0,#0xbc8
007ffb18	bl 0x00c2ff50
007ffb1c	cmn x0,#0x8
007ffb20	b.cs 0x007ffbf0
007ffb24	mov x20,x0
007ffb28	cmp x0,#0x17
007ffb2c	b.cs 0x007ffb40
007ffb30	lsl w8,w20,#0x1
007ffb34	strb w8,[x19], #0x1
007ffb38	cbnz x20,0x007ffb68
007ffb3c	b 0x007ffb7c
007ffb40	orr x8,x20,#0x7
007ffb44	mov w9,#0x1a
007ffb48	cmp x8,#0x17
007ffb4c	csinc x21,x9,x8,eq
007ffb50	mov x0,x21
007ffb54	bl 0x00c2fed0
007ffb58	orr x8,x21,#0x1
007ffb5c	stp x20,x0,[x19, #0x8]
007ffb60	str x8,[x19]
007ffb64	mov x19,x0
007ffb68	adrp x1,0xcca000
007ffb6c	add x1,x1,#0xbc8
007ffb70	mov x0,x19
007ffb74	mov x2,x20
007ffb78	bl 0x00c2ffd0
007ffb7c	strb wzr,[x19, x20]
007ffb80	ldr x8,[x27, #0x28]
007ffb84	ldur x9,[x29, #-0x8]
007ffb88	cmp x8,x9
007ffb8c	b.ne 0x007ffe64
007ffb90	ldp x20,x19,[sp, #0x80]
007ffb94	ldp x22,x21,[sp, #0x70]
007ffb98	ldp x24,x23,[sp, #0x60]
007ffb9c	ldp x26,x25,[sp, #0x50]
007ffba0	ldp x28,x27,[sp, #0x40]
007ffba4	ldp x29,x30,[sp, #0x30]
007ffba8	add sp,sp,#0x90
007ffbac	ret
007ffbb0	adrp x0,0xcca000
007ffbb4	add x0,x0,#0xbd0
007ffbb8	bl 0x00c2fe90
007ffbbc	cbz w0,0x007ffaec
007ffbc0	mov w8,#0x127
007ffbc4	nop
007ffbc8	adr x0,0x802220
007ffbcc	adrp x2,0xc48000
007ffbd0	add x2,x2,#0x880
007ffbd4	mov x1,x20
007ffbd8	strh w8,[x20]
007ffbdc	bl 0x00c2fe70
007ffbe0	adrp x0,0xcca000
007ffbe4	add x0,x0,#0xbd0
007ffbe8	bl 0x00c2fea0
007ffbec	b 0x007ffaec
007ffbf0	ldr x8,[x27, #0x28]
007ffbf4	ldur x9,[x29, #-0x8]
007ffbf8	cmp x8,x9
007ffbfc	b.ne 0x007ffe64
007ffc00	bl 0x007fe124
007ffc04	adrp x0,0xcca000
007ffc08	add x0,x0,#0xbf0
007ffc0c	bl 0x00c2fe90
007ffc10	cbz w0,0x007ff738
007ffc14	adrp x0,0xcca000
007ffc18	add x0,x0,#0xbd8
007ffc1c	mov x1,sp
007ffc20	bl 0x00802228
007ffc24	nop
007ffc28	adr x0,0x8022cc
007ffc2c	adrp x1,0xcca000
007ffc30	add x1,x1,#0xbd8
007ffc34	adrp x2,0xc48000
007ffc38	add x2,x2,#0x880
007ffc3c	bl 0x00c2fe70
007ffc40	adrp x0,0xcca000
007ffc44	add x0,x0,#0xbf0
007ffc48	bl 0x00c2fea0
007ffc4c	b 0x007ff738
007ffc50	adrp x0,0xcca000
007ffc54	add x0,x0,#0xc28
007ffc58	bl 0x00c2fe90
007ffc5c	cbz w0,0x007ff770
007ffc60	adrp x0,0xcca000
007ffc64	add x0,x0,#0xc00
007ffc68	mov x1,sp
007ffc6c	bl 0x008022d8
007ffc70	nop
007ffc74	adr x0,0x802404
007ffc78	adrp x1,0xcca000
007ffc7c	add x1,x1,#0xc00
007ffc80	adrp x2,0xc48000
007ffc84	add x2,x2,#0x880
007ffc88	bl 0x00c2fe70
007ffc8c	adrp x0,0xcca000
007ffc90	add x0,x0,#0xc28
007ffc94	bl 0x00c2fea0
007ffc98	b 0x007ff770
007ffc9c	adrp x0,0xcca000
007ffca0	add x0,x0,#0xc58
007ffca4	bl 0x00c2fe90
007ffca8	cbz w0,0x007ff820
007ffcac	adrp x0,0xcca000
007ffcb0	add x0,x0,#0xc30
007ffcb4	mov x1,sp
007ffcb8	bl 0x00802414
007ffcbc	nop
007ffcc0	adr x0,0x802528
007ffcc4	adrp x1,0xcca000
007ffcc8	add x1,x1,#0xc30
007ffccc	adrp x2,0xc48000
007ffcd0	add x2,x2,#0x880
007ffcd4	bl 0x00c2fe70
007ffcd8	adrp x0,0xcca000
007ffcdc	add x0,x0,#0xc58
007ffce0	bl 0x00c2fea0
007ffce4	b 0x007ff820
007ffce8	adrp x0,0xcca000
007ffcec	add x0,x0,#0xc70
007ffcf0	bl 0x00c2fe90
007ffcf4	cbz w0,0x007ff894
007ffcf8	adrp x8,0x29a000
007ffcfc	mov w9,#0x1
007ffd00	nop
007ffd04	adr x0,0x802538
007ffd08	ldr d0,[x8, #0xc58]
007ffd0c	mov w8,#0xc7e8
007ffd10	adrp x2,0xc48000
007ffd14	add x2,x2,#0x880
007ffd18	mov x1,x25
007ffd1c	strb w9,[x25, #0xa]
007ffd20	str d0,[x25]
007ffd24	strh w8,[x25, #0x8]
007ffd28	bl 0x00c2fe70
007ffd2c	adrp x0,0xcca000
007ffd30	add x0,x0,#0xc70
007ffd34	bl 0x00c2fea0
007ffd38	b 0x007ff894
007ffd3c	adrp x0,0xcca000
007ffd40	add x0,x0,#0xcc8
007ffd44	mov x25,x8
007ffd48	bl 0x00c2fe90
007ffd4c	mov x8,x25
007ffd50	cbz w0,0x007ff8ec
007ffd54	adrp x10,0x2dd000
007ffd58	add x10,x10,#0x438
007ffd5c	mov w9,#0x1
007ffd60	ldp q0,q1,[x10, #0x20]
007ffd64	strb w9,[x8, #0x48]
007ffd68	ldr x9,[x10, #0x40]
007ffd6c	nop
007ffd70	adr x0,0x802544
007ffd74	adrp x2,0xc48000
007ffd78	add x2,x2,#0x880
007ffd7c	mov x1,x25
007ffd80	stp q0,q1,[x8, #0x20]
007ffd84	ldp q1,q0,[x10]
007ffd88	str x9,[x8, #0x40]
007ffd8c	stp q1,q0,[x8]
007ffd90	bl 0x00c2fe70
007ffd94	adrp x0,0xcca000
007ffd98	add x0,x0,#0xcc8
007ffd9c	bl 0x00c2fea0
007ffda0	mov x8,x25
007ffda4	b 0x007ff8ec
007ffda8	adrp x0,0xcca000
007ffdac	add x0,x0,#0xce0
007ffdb0	bl 0x00c2fe90
007ffdb4	cbz w0,0x007ff994
007ffdb8	adrp x8,0x29b000
007ffdbc	adrp x9,0x29b000
007ffdc0	nop
007ffdc4	adr x0,0x802558
007ffdc8	ldr d0,[x8, #0xd80]
007ffdcc	ldr d1,[x9, #0x710]
007ffdd0	adrp x2,0xc48000
007ffdd4	add x2,x2,#0x880
007ffdd8	mov x1,x26
007ffddc	str d0,[x26]
007ffde0	str s1,[x26, #0x8]
007ffde4	bl 0x00c2fe70
007ffde8	adrp x0,0xcca000
007ffdec	add x0,x0,#0xce0
007ffdf0	bl 0x00c2fea0
007ffdf4	b 0x007ff994
007ffe64	bl 0x00c2fec0
