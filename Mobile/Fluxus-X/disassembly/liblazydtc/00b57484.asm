; FUN_00b57484 @ 00b57484
00b57484	sub sp,sp,#0x140
00b57488	stp x28,x27,[sp, #0xe0]
00b5748c	stp x26,x25,[sp, #0xf0]
00b57490	stp x24,x23,[sp, #0x100]
00b57494	stp x22,x21,[sp, #0x110]
00b57498	stp x20,x19,[sp, #0x120]
00b5749c	stp x29,x30,[sp, #0x130]
00b574a0	stp x0,x2,[sp, #0x20]
00b574a4	ldr x23,[x0, #0xf8]
00b574a8	mov w8,#0x10
00b574ac	str w8,[sp, #0x98]
00b574b0	mov x26,x4
00b574b4	ldur q0,[x23, #0x54]
00b574b8	mov x22,x3
00b574bc	mov x25,x1
00b574c0	mov x24,x5
00b574c4	str q0,[sp, #0x60]
00b574c8	ldrb w8,[x23, #0x63]
00b574cc	ldrb w9,[x23, #0x62]
00b574d0	ldrb w10,[x23, #0x61]
00b574d4	ldrb w11,[x23, #0x60]
00b574d8	ldrb w12,[x23, #0x5f]
00b574dc	add w4,w8,#0x1
00b574e0	ldrb w13,[x23, #0x5e]
00b574e4	add w3,w9,w4, LSR #0x8
00b574e8	ldrb w14,[x23, #0x5d]
00b574ec	add w2,w10,w3, LSR #0x8
00b574f0	ldrb w15,[x23, #0x5c]
00b574f4	add w1,w11,w2, LSR #0x8
00b574f8	ldrb w5,[x23, #0x5b]
00b574fc	add w0,w12,w1, LSR #0x8
00b57500	mov x27,x6
00b57504	ldrb w6,[x23, #0x5a]
00b57508	add w18,w13,w0, LSR #0x8
00b5750c	ldrb w7,[x23, #0x59]
00b57510	add w17,w14,w18, LSR #0x8
00b57514	ldrb w19,[x23, #0x58]
00b57518	add w16,w15,w17, LSR #0x8
00b5751c	ldrb w20,[x23, #0x57]
00b57520	add w15,w5,w16, LSR #0x8
00b57524	ldrb w28,[x23, #0x56]
00b57528	add w14,w6,w15, LSR #0x8
00b5752c	ldrb w30,[x23, #0x55]
00b57530	add w13,w7,w14, LSR #0x8
00b57534	ldrb w21,[x23, #0x54]
00b57538	add w12,w19,w13, LSR #0x8
00b5753c	add w11,w20,w12, LSR #0x8
00b57540	add w10,w28,w11, LSR #0x8
00b57544	add w9,w30,w10, LSR #0x8
00b57548	add w8,w21,w9, LSR #0x8
00b5754c	strb w4,[x23, #0x63]
00b57550	strb w3,[x23, #0x62]
00b57554	strb w2,[x23, #0x61]
00b57558	strb w1,[x23, #0x60]
00b5755c	strb w0,[x23, #0x5f]
00b57560	strb w18,[x23, #0x5e]
00b57564	strb w17,[x23, #0x5d]
00b57568	strb w16,[x23, #0x5c]
00b5756c	strb w15,[x23, #0x5b]
00b57570	strb w14,[x23, #0x5a]
00b57574	strb w13,[x23, #0x59]
00b57578	strb w12,[x23, #0x58]
00b5757c	strb w11,[x23, #0x57]
00b57580	strb w10,[x23, #0x56]
00b57584	strb w9,[x23, #0x55]
00b57588	strb w8,[x23, #0x54]
00b5758c	ldur q0,[x23, #0x54]
00b57590	add x20,x23,#0x54
00b57594	add x29,sp,#0x130
00b57598	str q0,[sp, #0x70]
00b5759c	ldr x5,[x23, #0x28]
00b575a0	cmp x5,#0x10
00b575a4	b.ne 0x00b575b0
00b575a8	mov w19,#0x20
00b575ac	b 0x00b57678
00b575b0	and w4,w4,#0xff
00b575b4	add w4,w4,#0x1
00b575b8	strb w4,[x23, #0x63]
00b575bc	lsr w4,w4,#0x8
00b575c0	add w3,w4,w3, UXTB 
00b575c4	strb w3,[x23, #0x62]
00b575c8	lsr w3,w3,#0x8
00b575cc	add w2,w3,w2, UXTB 
00b575d0	strb w2,[x23, #0x61]
00b575d4	lsr w2,w2,#0x8
00b575d8	add w1,w2,w1, UXTB 
00b575dc	strb w1,[x23, #0x60]
00b575e0	lsr w1,w1,#0x8
00b575e4	add w0,w1,w0, UXTB 
00b575e8	strb w0,[x23, #0x5f]
00b575ec	lsr w0,w0,#0x8
00b575f0	add w18,w0,w18, UXTB 
00b575f4	strb w18,[x23, #0x5e]
00b575f8	lsr w18,w18,#0x8
00b575fc	add w17,w18,w17, UXTB 
00b57600	strb w17,[x23, #0x5d]
00b57604	lsr w17,w17,#0x8
00b57608	add w16,w17,w16, UXTB 
00b5760c	strb w16,[x23, #0x5c]
00b57610	lsr w16,w16,#0x8
00b57614	add w15,w16,w15, UXTB 
00b57618	strb w15,[x23, #0x5b]
00b5761c	lsr w15,w15,#0x8
00b57620	add w14,w15,w14, UXTB 
00b57624	strb w14,[x23, #0x5a]
00b57628	lsr w14,w14,#0x8
00b5762c	add w13,w14,w13, UXTB 
00b57630	strb w13,[x23, #0x59]
00b57634	lsr w13,w13,#0x8
00b57638	add w12,w13,w12, UXTB 
00b5763c	strb w12,[x23, #0x58]
00b57640	lsr w12,w12,#0x8
00b57644	add w11,w12,w11, UXTB 
00b57648	strb w11,[x23, #0x57]
00b5764c	lsr w11,w11,#0x8
00b57650	add w10,w11,w10, UXTB 
00b57654	strb w10,[x23, #0x56]
00b57658	lsr w10,w10,#0x8
00b5765c	add w9,w10,w9, UXTB 
00b57660	add w8,w8,w9, LSR #0x8
00b57664	strb w9,[x23, #0x55]
00b57668	strb w8,[x23, #0x54]
00b5766c	ldr q0,[x20]
00b57670	orr w19,wzr,#0x30
00b57674	str q0,[sp, #0x80]
00b57678	ldr x0,[x23]
00b5767c	add x1,sp,#0x30
00b57680	add x2,sp,#0x98
00b57684	add x3,sp,#0x60
00b57688	mov w4,w19
00b5768c	bl 0x00c36d70
00b57690	cbz w0,0x00b585a4
00b57694	ldr w8,[sp, #0x98]
00b57698	mov w0,wzr
00b5769c	cmp w8,w19
00b576a0	b.ne 0x00b585a4
00b576a4	ldr x28,[x23, #0x28]
00b576a8	add x21,x23,#0x34
00b576ac	add x1,sp,#0x30
00b576b0	mov x0,x21
00b576b4	mov x2,x28
00b576b8	add x19,sp,#0x30
00b576bc	bl 0x00c2ffd0
00b576c0	ldr q0,[x19,x28]
00b576c4	str q0,[x20]
00b576c8	ldr w8,[x23, #0x30]
00b576cc	cbz w8,0x00b5783c
00b576d0	cbnz x22,0x00b57b6c
00b576d4	cbnz x25,0x00b57b6c
00b576d8	cbnz x24,0x00b57b6c
00b576dc	ldr x8,[sp, #0x28]
00b576e0	cbz x8,0x00b57b24
00b576e4	ldr x8,[sp, #0x20]
00b576e8	ldr x8,[x8, #0xe8]
00b576ec	cbz x8,0x00b57b24
00b576f0	ldr x9,[x23, #0x28]
00b576f4	cmp x9,x8
00b576f8	csel x10,x8,x9,hi
00b576fc	cbz x10,0x00b5776c
00b57700	cmp x10,#0x20
00b57704	mov x9,xzr
00b57708	b.cc 0x00b57748
00b5770c	and x9,x10,#-0x20
00b57710	add x11,x23,#0x80
00b57714	mov x12,x9
00b57718	ldp q0,q1,[x11]
00b5771c	ldur q2,[x11, #-0x4c]
00b57720	ldur q3,[x11, #-0x3c]
00b57724	subs x12,x12,#0x20
00b57728	eor v0.16B,v2.16B,v0.16B
00b5772c	eor v1.16B,v3.16B,v1.16B
00b57730	stur q0,[x11, #-0x4c]
00b57734	stur q1,[x11, #-0x3c]
00b57738	add x11,x11,#0x20
00b5773c	b.ne 0x00b57718
00b57740	cmp x10,x9
00b57744	b.eq 0x00b57768
00b57748	add x11,x23,x9
00b5774c	ldrb w12,[x11, #0x80]
00b57750	ldrb w13,[x11, #0x34]
00b57754	add x9,x9,#0x1
00b57758	cmp x9,x10
00b5775c	eor w12,w13,w12
00b57760	strb w12,[x11, #0x34]
00b57764	b.cc 0x00b57748
00b57768	ldr x9,[x23, #0x28]
00b5776c	subs x10,x8,x9
00b57770	b.ls 0x00b57b24
00b57774	cmp x10,#0x10
00b57778	mov w11,#0x10
00b5777c	csel x10,x10,x11,cc
00b57780	cbz x10,0x00b57b24
00b57784	cmp x10,#0x20
00b57788	b.cc 0x00b5780c
00b5778c	sub x11,x9,#0x1
00b57790	sub x8,x11,x8
00b57794	orr x13,xzr,#-0x11
00b57798	cmn x8,#0x11
00b5779c	csel x11,x8,x13,hi
00b577a0	add x8,x9,#0x7f
00b577a4	sub x8,x8,x11
00b577a8	add x12,x23,#0x54
00b577ac	add x8,x23,x8
00b577b0	cmp x12,x8
00b577b4	add x8,x23,x9
00b577b8	b.cs 0x00b577d8
00b577bc	orr w12,wzr,#0x1f
00b577c0	sub x11,x12,x11
00b577c4	add x11,x23,x11
00b577c8	add x11,x11,#0x34
00b577cc	add x12,x8,#0x80
00b577d0	cmp x12,x11
00b577d4	b.cc 0x00b5780c
00b577d8	mov x11,xzr
00b577dc	add x12,x8,x11
00b577e0	add x13,x23,x11
00b577e4	ldp q0,q1,[x12, #0x80]
00b577e8	ldur q2,[x13, #0x54]
00b577ec	ldur q3,[x13, #0x64]
00b577f0	adds x11,x11,#0x20
00b577f4	eor v0.16B,v2.16B,v0.16B
00b577f8	eor v1.16B,v3.16B,v1.16B
00b577fc	stur q0,[x13, #0x54]
00b57800	stur q1,[x13, #0x64]
00b57804	b.ne 0x00b577dc
00b57808	cbz x10,0x00b57b24
00b5780c	add x9,x23,x9
00b57810	mov x8,xzr
00b57814	add x9,x9,#0x80
00b57818	add x11,x23,#0x54
00b5781c	ldrb w12,[x9, x8]
00b57820	ldrb w13,[x11, x8]
00b57824	eor w12,w13,w12
00b57828	strb w12,[x11, x8]
00b5782c	add x8,x8,#0x1
00b57830	cmp x8,x10
00b57834	b.cc 0x00b5781c
00b57838	b 0x00b57b24
00b5783c	cbz x25,0x00b579b4
00b57840	ldr x13,[sp, #0x28]
00b57844	cbz x13,0x00b579b4
00b57848	cmp x28,x13
00b5784c	csel x8,x13,x28,hi
00b57850	cbz x8,0x00b578ec
00b57854	cmp x8,#0x20
00b57858	mov x9,xzr
00b5785c	b.cc 0x00b578c8
00b57860	cmp x28,x13
00b57864	add x10,x23,#0x34
00b57868	add x11,x25,x8
00b5786c	csel x9,x13,x28,hi
00b57870	cmp x10,x11
00b57874	b.cs 0x00b5788c
00b57878	add x9,x23,x9
00b5787c	add x9,x9,#0x34
00b57880	cmp x9,x25
00b57884	mov x9,xzr
00b57888	b.hi 0x00b578c8
00b5788c	and x9,x8,#-0x20
00b57890	add x10,x25,#0x10
00b57894	add x11,x23,#0x44
00b57898	mov x12,x9
00b5789c	ldp q0,q1,[x10, #-0x10]
00b578a0	ldp q2,q3,[x11, #-0x10]
00b578a4	add x10,x10,#0x20
00b578a8	subs x12,x12,#0x20
00b578ac	eor v0.16B,v2.16B,v0.16B
00b578b0	eor v1.16B,v3.16B,v1.16B
00b578b4	stp q0,q1,[x11, #-0x10]
00b578b8	add x11,x11,#0x20
00b578bc	b.ne 0x00b5789c
00b578c0	cmp x8,x9
00b578c4	b.eq 0x00b578e8
00b578c8	add x11,x23,x9
00b578cc	ldrb w10,[x25, x9]
00b578d0	ldrb w12,[x11, #0x34]
00b578d4	add x9,x9,#0x1
00b578d8	cmp x9,x8
00b578dc	eor w10,w12,w10
00b578e0	strb w10,[x11, #0x34]
00b578e4	b.cc 0x00b578c8
00b578e8	ldr x28,[x23, #0x28]
00b578ec	cmp x28,x13
00b578f0	b.cs 0x00b579b4
00b578f4	sub x8,x13,x28
00b578f8	cmp x8,#0x10
00b578fc	mov w9,#0x10
00b57900	csel x8,x8,x9,cc
00b57904	cbz x8,0x00b579b4
00b57908	cmp x8,#0x20
00b5790c	b.cc 0x00b5798c
00b57910	sub x11,x28,#0x1
00b57914	sub x9,x11,x13
00b57918	cmn x9,#0x11
00b5791c	orr x12,xzr,#-0x11
00b57920	csel x9,x9,x12,hi
00b57924	sub x11,x11,x9
00b57928	add x10,x23,#0x54
00b5792c	add x11,x25,x11
00b57930	cmp x10,x11
00b57934	add x10,x25,x28
00b57938	b.cs 0x00b57954
00b5793c	orr w11,wzr,#0x1f
00b57940	sub x9,x11,x9
00b57944	add x9,x23,x9
00b57948	add x9,x9,#0x34
00b5794c	cmp x10,x9
00b57950	b.cc 0x00b5798c
00b57954	mov x9,xzr
00b57958	add x10,x10,#0x10
00b5795c	add x11,x23,#0x64
00b57960	add x12,x10,x9
00b57964	add x13,x11,x9
00b57968	ldr q0,[x10,x9]
00b5796c	ldur q1,[x12, #-0x10]
00b57970	ldp q2,q3,[x13, #-0x10]
00b57974	adds x9,x9,#0x20
00b57978	eor v1.16B,v2.16B,v1.16B
00b5797c	eor v0.16B,v3.16B,v0.16B
00b57980	stp q1,q0,[x13, #-0x10]
00b57984	b.ne 0x00b57960
00b57988	cbz x8,0x00b579b4
00b5798c	mov x9,xzr
00b57990	add x10,x25,x28
00b57994	add x11,x23,#0x54
00b57998	ldrb w12,[x10, x9]
00b5799c	ldrb w13,[x11, x9]
00b579a0	eor w12,w13,w12
00b579a4	strb w12,[x11, x9]
00b579a8	add x9,x9,#0x1
00b579ac	cmp x9,x8
00b579b0	b.cc 0x00b57998
00b579b4	cbz x22,0x00b57b24
00b579b8	cbz x26,0x00b57b24
00b579bc	cmp x28,x26
00b579c0	csel x8,x26,x28,hi
00b579c4	cbz x8,0x00b57a60
00b579c8	cmp x8,#0x20
00b579cc	mov x9,xzr
00b579d0	b.cc 0x00b57a3c
00b579d4	cmp x28,x26
00b579d8	add x10,x23,#0x34
00b579dc	add x11,x22,x8
00b579e0	csel x9,x26,x28,hi
00b579e4	cmp x10,x11
00b579e8	b.cs 0x00b57a00
00b579ec	add x9,x23,x9
00b579f0	add x9,x9,#0x34
00b579f4	cmp x9,x22
00b579f8	mov x9,xzr
00b579fc	b.hi 0x00b57a3c
00b57a00	and x9,x8,#-0x20
00b57a04	add x10,x22,#0x10
00b57a08	add x11,x23,#0x44
00b57a0c	mov x12,x9
00b57a10	ldp q0,q1,[x10, #-0x10]
00b57a14	ldp q2,q3,[x11, #-0x10]
00b57a18	add x10,x10,#0x20
00b57a1c	subs x12,x12,#0x20
00b57a20	eor v0.16B,v2.16B,v0.16B
00b57a24	eor v1.16B,v3.16B,v1.16B
00b57a28	stp q0,q1,[x11, #-0x10]
00b57a2c	add x11,x11,#0x20
00b57a30	b.ne 0x00b57a10
00b57a34	cmp x8,x9
00b57a38	b.eq 0x00b57a5c
00b57a3c	add x11,x23,x9
00b57a40	ldrb w10,[x22, x9]
00b57a44	ldrb w12,[x11, #0x34]
00b57a48	add x9,x9,#0x1
00b57a4c	cmp x9,x8
00b57a50	eor w10,w12,w10
00b57a54	strb w10,[x11, #0x34]
00b57a58	b.cc 0x00b57a3c
00b57a5c	ldr x28,[x23, #0x28]
00b57a60	cmp x28,x26
00b57a64	b.cs 0x00b57b24
00b57a68	sub x8,x26,x28
00b57a6c	cmp x8,#0x10
00b57a70	mov w9,#0x10
00b57a74	csel x8,x8,x9,cc
00b57a78	cbz x8,0x00b57b24
00b57a7c	cmp x8,#0x20
00b57a80	b.cc 0x00b57afc
00b57a84	sub x11,x28,#0x1
00b57a88	sub x10,x11,x26
00b57a8c	cmn x10,#0x11
00b57a90	orr x12,xzr,#-0x11
00b57a94	csel x10,x10,x12,hi
00b57a98	sub x11,x11,x10
00b57a9c	add x9,x23,#0x54
00b57aa0	add x11,x22,x11
00b57aa4	cmp x9,x11
00b57aa8	add x9,x22,x28
00b57aac	b.cs 0x00b57ac8
00b57ab0	orr w11,wzr,#0x1f
00b57ab4	sub x10,x11,x10
00b57ab8	add x10,x23,x10
00b57abc	add x10,x10,#0x34
00b57ac0	cmp x9,x10
00b57ac4	b.cc 0x00b57afc
00b57ac8	mov x10,xzr
00b57acc	add x11,x9,x10
00b57ad0	add x12,x23,x10
00b57ad4	ldp q0,q1,[x11]
00b57ad8	ldur q2,[x12, #0x54]
00b57adc	ldur q3,[x12, #0x64]
00b57ae0	adds x10,x10,#0x20
00b57ae4	eor v0.16B,v2.16B,v0.16B
00b57ae8	eor v1.16B,v3.16B,v1.16B
00b57aec	stur q0,[x12, #0x54]
00b57af0	stur q1,[x12, #0x64]
00b57af4	b.ne 0x00b57acc
00b57af8	cbz x8,0x00b57b24
00b57afc	mov x9,xzr
00b57b00	add x10,x22,x28
00b57b04	add x11,x23,#0x54
00b57b08	ldrb w12,[x10, x9]
00b57b0c	ldrb w13,[x11, x9]
00b57b10	eor w12,w13,w12
00b57b14	strb w12,[x11, x9]
00b57b18	add x9,x9,#0x1
00b57b1c	cmp x9,x8
00b57b20	b.cc 0x00b57b08
00b57b24	ldr x0,[x23]
00b57b28	mov w5,#0xffffffff
00b57b2c	mov x1,xzr
00b57b30	mov x2,xzr
00b57b34	mov x3,x21
00b57b38	mov x4,xzr
00b57b3c	bl 0x00c34be0
00b57b40	cbz w0,0x00b585a4
00b57b44	ldr x0,[x23, #0x8]
00b57b48	mov w5,#0xffffffff
00b57b4c	mov x1,xzr
00b57b50	mov x2,xzr
00b57b54	mov x3,x21
00b57b58	mov x4,xzr
00b57b5c	bl 0x00c34be0
00b57b60	cmp w0,#0x0
00b57b64	cset w0,ne
00b57b68	b 0x00b585a4
00b57b6c	mov w9,#0x10
00b57b70	movi v0.2D,#0x0
00b57b74	mov x19,x23
00b57b78	cmp x28,#0x10
00b57b7c	orr w10,wzr,#0x30
00b57b80	mov w11,#0x20
00b57b84	csel w28,w11,w10,eq
00b57b88	mov w10,#0x2
00b57b8c	stur w9,[x29, #-0x94]
00b57b90	stp q0,q0,[x29, #-0x80]
00b57b94	stur q0,[x29, #-0x90]
00b57b98	str q0,[x19, #0x80]!
00b57b9c	stp q0,q0,[x19, #0x10]
00b57ba0	sturb w10,[x29, #-0x6d]
00b57ba4	sub x10,x28,#0x1
00b57ba8	mov w8,#0x1
00b57bac	cmp x10,#0x20
00b57bb0	sturb w8,[x29, #-0x7d]
00b57bb4	stur w9,[x29, #-0x5c]
00b57bb8	strb wzr,[x19]
00b57bbc	b.cc 0x00b57c00
00b57bc0	sub w8,w28,#0x1
00b57bc4	and w8,w8,#0x1f
00b57bc8	sub x9,x29,#0x90
00b57bcc	sub x10,x10,x8
00b57bd0	add x9,x9,#0x11
00b57bd4	orr x8,x10,#0x1
00b57bd8	add x11,x23,#0x91
00b57bdc	ldp q0,q1,[x9, #-0x10]
00b57be0	ldp q2,q3,[x11, #-0x10]
00b57be4	add x9,x9,#0x20
00b57be8	subs x10,x10,#0x20
00b57bec	eor v0.16B,v2.16B,v0.16B
00b57bf0	eor v1.16B,v3.16B,v1.16B
00b57bf4	stp q0,q1,[x11, #-0x10]
00b57bf8	add x11,x11,#0x20
00b57bfc	b.ne 0x00b57bdc
00b57c00	add x10,x23,x8
00b57c04	sub x11,x29,#0x90
00b57c08	sub x9,x28,x8
00b57c0c	add x10,x10,#0x80
00b57c10	add x8,x11,x8
00b57c14	ldrb w11,[x8], #0x1
00b57c18	ldrb w12,[x10]
00b57c1c	subs x9,x9,#0x1
00b57c20	eor w11,w12,w11
00b57c24	strb w11,[x10], #0x1
00b57c28	b.ne 0x00b57c14
00b57c2c	ldr x0,[x23, #0x10]
00b57c30	sub x2,x29,#0x5c
00b57c34	mov x1,x19
00b57c38	mov x3,x19
00b57c3c	mov w4,w28
00b57c40	bl 0x00c36d70
00b57c44	cbz w0,0x00b585a0
00b57c48	ldur w8,[x29, #-0x5c]
00b57c4c	cmp w8,w28
00b57c50	b.ne 0x00b585a0
00b57c54	ldr x9,[sp, #0x28]
00b57c58	cmp x25,#0x0
00b57c5c	ldr x8,[x23, #0x28]
00b57c60	strh wzr,[x23, #0x68]
00b57c64	csel x28,xzr,x9,eq
00b57c68	cmp x24,#0x0
00b57c6c	csel x27,xzr,x27,eq
00b57c70	cmp x22,#0x0
00b57c74	csel x26,xzr,x26,eq
00b57c78	add x9,x26,x28
00b57c7c	add w10,w8,#0x10
00b57c80	add x9,x9,x27
00b57c84	strb w10,[x23, #0x6b]
00b57c88	lsr x10,x9,#0x18
00b57c8c	strb w10,[x23, #0x64]
00b57c90	lsr x10,x9,#0x10
00b57c94	strb w9,[x23, #0x67]
00b57c98	lsr x9,x9,#0x8
00b57c9c	strb w10,[x23, #0x65]
00b57ca0	add x10,x23,#0x64
00b57ca4	strb w9,[x23, #0x66]
00b57ca8	mov w9,#0x8
00b57cac	str x10,[sp, #0x18]
00b57cb0	strb wzr,[x23, #0x6a]
00b57cb4	str x9,[x23, #0x78]
00b57cb8	cbz x25,0x00b57cec
00b57cbc	cbz x28,0x00b57cec
00b57cc0	subs x20,x28,#0x8
00b57cc4	b.cs 0x00b57d48
00b57cc8	mov w8,#0x8
00b57ccc	add x8,x23,x8
00b57cd0	add x0,x8,#0x64
00b57cd4	mov x1,x25
00b57cd8	mov x2,x28
00b57cdc	bl 0x00c2ffd0
00b57ce0	ldr x8,[x23, #0x78]
00b57ce4	add x8,x8,x28
00b57ce8	str x8,[x23, #0x78]
00b57cec	cbz x24,0x00b58060
00b57cf0	cbz x27,0x00b58060
00b57cf4	ldr x8,[x23, #0x78]
00b57cf8	cbz x8,0x00b57f6c
00b57cfc	mov w9,#0x10
00b57d00	sub x25,x9,x8
00b57d04	subs x20,x27,x25
00b57d08	b.cc 0x00b57f6c
00b57d0c	add x8,x23,x8
00b57d10	add x0,x8,#0x64
00b57d14	mov x1,x24
00b57d18	mov x2,x25
00b57d1c	bl 0x00c2ffd0
00b57d20	ldr x9,[sp, #0x18]
00b57d24	ldr q0,[x9]
00b57d28	stur q0,[x29, #-0x90]
00b57d2c	ldr q0,[x9]
00b57d30	stur q0,[x29, #-0x80]
00b57d34	ldr x8,[x23, #0x28]
00b57d38	cmp x8,#0x10
00b57d3c	b.ne 0x00b57ee0
00b57d40	mov w27,#0x20
00b57d44	b 0x00b57eec
00b57d48	ldr x9,[x25]
00b57d4c	cmp x8,#0x10
00b57d50	stur x9,[x23, #0x6c]
00b57d54	ldr x9,[sp, #0x18]
00b57d58	ldr q0,[x9]
00b57d5c	stur q0,[x29, #-0x90]
00b57d60	ldr q0,[x9]
00b57d64	stur q0,[x29, #-0x80]
00b57d68	b.ne 0x00b57d74
00b57d6c	mov w28,#0x20
00b57d70	b 0x00b57d80
00b57d74	ldr q0,[x9]
00b57d78	orr w28,wzr,#0x30
00b57d7c	stur q0,[x29, #-0x70]
00b57d80	mov w8,#0x10
00b57d84	stur w8,[x29, #-0x5c]
00b57d88	ldp q0,q1,[x29, #-0x90]
00b57d8c	ldp q2,q3,[x23, #0x80]
00b57d90	cmp w28,#0x20
00b57d94	eor v0.16B,v2.16B,v0.16B
00b57d98	eor v1.16B,v3.16B,v1.16B
00b57d9c	stp q0,q1,[x23, #0x80]
00b57da0	b.eq 0x00b57dcc
00b57da4	sub x10,x29,#0x90
00b57da8	sub x8,x28,#0x20
00b57dac	add x9,x23,#0xa0
00b57db0	add x10,x10,#0x20
00b57db4	ldrb w11,[x10], #0x1
00b57db8	ldrb w12,[x9]
00b57dbc	subs x8,x8,#0x1
00b57dc0	eor w11,w12,w11
00b57dc4	strb w11,[x9], #0x1
00b57dc8	b.ne 0x00b57db4
00b57dcc	ldr x0,[x23, #0x10]
00b57dd0	sub x2,x29,#0x5c
00b57dd4	mov x1,x19
00b57dd8	mov x3,x19
00b57ddc	mov w4,w28
00b57de0	bl 0x00c36d70
00b57de4	cbz w0,0x00b585a0
00b57de8	ldur w8,[x29, #-0x5c]
00b57dec	cmp w8,w28
00b57df0	b.ne 0x00b585a0
00b57df4	cmp x20,#0x10
00b57df8	add x25,x25,#0x8
00b57dfc	str xzr,[x23, #0x78]
00b57e00	b.cc 0x00b57ed0
00b57e04	sub x8,x29,#0x90
00b57e08	add x9,x23,#0xa0
00b57e0c	str x9,[sp]
00b57e10	add x9,x8,#0x10
00b57e14	add x8,x8,#0x20
00b57e18	stp x8,x9,[sp, #0x8]
00b57e1c	ldr q0,[x25]
00b57e20	ldr x8,[sp, #0x10]
00b57e24	stur q0,[x29, #-0x90]
00b57e28	ldr q0,[x25]
00b57e2c	str q0,[x8]
00b57e30	ldr x8,[x23, #0x28]
00b57e34	cmp x8,#0x10
00b57e38	b.ne 0x00b57e44
00b57e3c	mov w28,#0x20
00b57e40	b 0x00b57e54
00b57e44	ldr q0,[x25]
00b57e48	ldr x8,[sp, #0x8]
00b57e4c	orr w28,wzr,#0x30
00b57e50	str q0,[x8]
00b57e54	mov w8,#0x10
00b57e58	stur w8,[x29, #-0x5c]
00b57e5c	ldp q0,q1,[x29, #-0x90]
00b57e60	ldp q2,q3,[x23, #0x80]
00b57e64	cmp w28,#0x20
00b57e68	eor v0.16B,v2.16B,v0.16B
00b57e6c	eor v1.16B,v3.16B,v1.16B
00b57e70	stp q0,q1,[x23, #0x80]
00b57e74	b.eq 0x00b57e98
00b57e78	ldp x10,x9,[sp]
00b57e7c	sub x8,x28,#0x20
00b57e80	ldrb w11,[x9], #0x1
00b57e84	ldrb w12,[x10]
00b57e88	subs x8,x8,#0x1
00b57e8c	eor w11,w12,w11
00b57e90	strb w11,[x10], #0x1
00b57e94	b.ne 0x00b57e80
00b57e98	ldr x0,[x23, #0x10]
00b57e9c	sub x2,x29,#0x5c
00b57ea0	mov x1,x19
00b57ea4	mov x3,x19
00b57ea8	mov w4,w28
00b57eac	bl 0x00c36d70
00b57eb0	cbz w0,0x00b585a0
00b57eb4	ldur w8,[x29, #-0x5c]
00b57eb8	cmp w8,w28
00b57ebc	b.ne 0x00b585a0
00b57ec0	sub x20,x20,#0x10
00b57ec4	cmp x20,#0xf
00b57ec8	add x25,x25,#0x10
00b57ecc	b.hi 0x00b57e1c
00b57ed0	cbz x20,0x00b57cec
00b57ed4	ldr x8,[x23, #0x78]
00b57ed8	mov x28,x20
00b57edc	b 0x00b57ccc
00b57ee0	ldr q0,[x9]
00b57ee4	orr w27,wzr,#0x30
00b57ee8	stur q0,[x29, #-0x70]
00b57eec	mov w8,#0x10
00b57ef0	stur w8,[x29, #-0x5c]
00b57ef4	ldp q0,q1,[x29, #-0x90]
00b57ef8	ldp q2,q3,[x23, #0x80]
00b57efc	cmp w27,#0x20
00b57f00	eor v0.16B,v2.16B,v0.16B
00b57f04	eor v1.16B,v3.16B,v1.16B
00b57f08	stp q0,q1,[x23, #0x80]
00b57f0c	b.eq 0x00b57f38
00b57f10	sub x10,x29,#0x90
00b57f14	sub x8,x27,#0x20
00b57f18	add x9,x23,#0xa0
00b57f1c	add x10,x10,#0x20
00b57f20	ldrb w11,[x10], #0x1
00b57f24	ldrb w12,[x9]
00b57f28	subs x8,x8,#0x1
00b57f2c	eor w11,w12,w11
00b57f30	strb w11,[x9], #0x1
00b57f34	b.ne 0x00b57f20
00b57f38	ldr x0,[x23, #0x10]
00b57f3c	sub x2,x29,#0x5c
00b57f40	mov x1,x19
00b57f44	mov x3,x19
00b57f48	mov w4,w27
00b57f4c	bl 0x00c36d70
00b57f50	cbz w0,0x00b585a0
00b57f54	ldur w8,[x29, #-0x5c]
00b57f58	cmp w8,w27
00b57f5c	b.ne 0x00b585a0
00b57f60	add x24,x24,x25
00b57f64	mov x27,x20
00b57f68	str xzr,[x23, #0x78]
00b57f6c	cmp x27,#0x10
00b57f70	b.cc 0x00b58038
00b57f74	sub x8,x29,#0x90
00b57f78	add x9,x23,#0xa0
00b57f7c	add x28,x8,#0x10
00b57f80	add x20,x8,#0x20
00b57f84	str x9,[sp, #0x10]
00b57f88	ldr q0,[x24]
00b57f8c	stur q0,[x29, #-0x90]
00b57f90	ldr q0,[x24]
00b57f94	str q0,[x28]
00b57f98	ldr x8,[x23, #0x28]
00b57f9c	cmp x8,#0x10
00b57fa0	b.ne 0x00b57fac
00b57fa4	mov w25,#0x20
00b57fa8	b 0x00b57fb8
00b57fac	ldr q0,[x24]
00b57fb0	orr w25,wzr,#0x30
00b57fb4	str q0,[x20]
00b57fb8	mov w8,#0x10
00b57fbc	stur w8,[x29, #-0x5c]
00b57fc0	ldp q0,q1,[x29, #-0x90]
00b57fc4	ldp q2,q3,[x23, #0x80]
00b57fc8	cmp w25,#0x20
00b57fcc	eor v0.16B,v2.16B,v0.16B
00b57fd0	eor v1.16B,v3.16B,v1.16B
00b57fd4	stp q0,q1,[x23, #0x80]
00b57fd8	b.eq 0x00b58000
00b57fdc	ldr x10,[sp, #0x10]
00b57fe0	sub x8,x25,#0x20
00b57fe4	mov x9,x20
00b57fe8	ldrb w11,[x9], #0x1
00b57fec	ldrb w12,[x10]
00b57ff0	subs x8,x8,#0x1
00b57ff4	eor w11,w12,w11
00b57ff8	strb w11,[x10], #0x1
00b57ffc	b.ne 0x00b57fe8
00b58000	ldr x0,[x23, #0x10]
00b58004	sub x2,x29,#0x5c
00b58008	mov x1,x19
00b5800c	mov x3,x19
00b58010	mov w4,w25
00b58014	bl 0x00c36d70
00b58018	cbz w0,0x00b585a0
00b5801c	ldur w8,[x29, #-0x5c]
00b58020	cmp w8,w25
00b58024	b.ne 0x00b585a0
00b58028	sub x27,x27,#0x10
00b5802c	cmp x27,#0xf
00b58030	add x24,x24,#0x10
00b58034	b.hi 0x00b57f88
00b58038	cbz x27,0x00b58060
00b5803c	ldr x8,[x23, #0x78]
00b58040	mov x1,x24
00b58044	mov x2,x27
00b58048	add x8,x23,x8
00b5804c	add x0,x8,#0x64
00b58050	bl 0x00c2ffd0
00b58054	ldr x8,[x23, #0x78]
00b58058	add x8,x8,x27
00b5805c	str x8,[x23, #0x78]
00b58060	cbz x22,0x00b58240
00b58064	cbz x26,0x00b58240
00b58068	ldr x8,[x23, #0x78]
00b5806c	cbz x8,0x00b58148
00b58070	mov w9,#0x10
00b58074	sub x24,x9,x8
00b58078	subs x20,x26,x24
00b5807c	b.cc 0x00b58148
00b58080	add x8,x23,x8
00b58084	add x0,x8,#0x64
00b58088	mov x1,x22
00b5808c	mov x2,x24
00b58090	bl 0x00c2ffd0
00b58094	ldr x9,[sp, #0x18]
00b58098	ldr q0,[x9]
00b5809c	stur q0,[x29, #-0x90]
00b580a0	ldr q0,[x9]
00b580a4	stur q0,[x29, #-0x80]
00b580a8	ldr x8,[x23, #0x28]
00b580ac	cmp x8,#0x10
00b580b0	b.ne 0x00b580bc
00b580b4	mov w25,#0x20
00b580b8	b 0x00b580c8
00b580bc	ldr q0,[x9]
00b580c0	orr w25,wzr,#0x30
00b580c4	stur q0,[x29, #-0x70]
00b580c8	mov w8,#0x10
00b580cc	stur w8,[x29, #-0x5c]
00b580d0	ldp q0,q1,[x29, #-0x90]
00b580d4	ldp q2,q3,[x23, #0x80]
00b580d8	cmp w25,#0x20
00b580dc	eor v0.16B,v2.16B,v0.16B
00b580e0	eor v1.16B,v3.16B,v1.16B
00b580e4	stp q0,q1,[x23, #0x80]
00b580e8	b.eq 0x00b58114
00b580ec	sub x10,x29,#0x90
00b580f0	sub x8,x25,#0x20
00b580f4	add x9,x23,#0xa0
00b580f8	add x10,x10,#0x20
00b580fc	ldrb w11,[x10], #0x1
00b58100	ldrb w12,[x9]
00b58104	subs x8,x8,#0x1
00b58108	eor w11,w12,w11
00b5810c	strb w11,[x9], #0x1
00b58110	b.ne 0x00b580fc
00b58114	ldr x0,[x23, #0x10]
00b58118	sub x2,x29,#0x5c
00b5811c	mov x1,x19
00b58120	mov x3,x19
00b58124	mov w4,w25
00b58128	bl 0x00c36d70
00b5812c	cbz w0,0x00b585a0
00b58130	ldur w8,[x29, #-0x5c]
00b58134	cmp w8,w25
00b58138	b.ne 0x00b585a0
00b5813c	add x22,x22,x24
00b58140	mov x26,x20
00b58144	str xzr,[x23, #0x78]
00b58148	cmp x26,#0x10
00b5814c	b.cc 0x00b58210
00b58150	sub x8,x29,#0x90
00b58154	add x20,x23,#0xa0
00b58158	add x25,x8,#0x10
00b5815c	add x27,x8,#0x20
00b58160	mov w28,#0x10
00b58164	ldr q0,[x22]
00b58168	stur q0,[x29, #-0x90]
00b5816c	ldr q0,[x22]
00b58170	str q0,[x25]
00b58174	ldr x8,[x23, #0x28]
00b58178	cmp x8,#0x10
00b5817c	b.ne 0x00b58188
00b58180	mov w24,#0x20
00b58184	b 0x00b58194
00b58188	ldr q0,[x22]
00b5818c	orr w24,wzr,#0x30
00b58190	str q0,[x27]
00b58194	stur w28,[x29, #-0x5c]
00b58198	ldp q0,q1,[x29, #-0x90]
00b5819c	ldp q2,q3,[x23, #0x80]
00b581a0	cmp w24,#0x20
00b581a4	eor v0.16B,v2.16B,v0.16B
00b581a8	eor v1.16B,v3.16B,v1.16B
00b581ac	stp q0,q1,[x23, #0x80]
00b581b0	b.eq 0x00b581d8
00b581b4	sub x8,x24,#0x20
00b581b8	mov x9,x27
00b581bc	mov x10,x20
00b581c0	ldrb w11,[x9], #0x1
00b581c4	ldrb w12,[x10]
00b581c8	subs x8,x8,#0x1
00b581cc	eor w11,w12,w11
00b581d0	strb w11,[x10], #0x1
00b581d4	b.ne 0x00b581c0
00b581d8	ldr x0,[x23, #0x10]
00b581dc	sub x2,x29,#0x5c
00b581e0	mov x1,x19
00b581e4	mov x3,x19
00b581e8	mov w4,w24
00b581ec	bl 0x00c36d70
00b581f0	cbz w0,0x00b585a0
00b581f4	ldur w8,[x29, #-0x5c]
00b581f8	cmp w8,w24
00b581fc	b.ne 0x00b585a0
00b58200	sub x26,x26,#0x10
00b58204	cmp x26,#0xf
00b58208	add x22,x22,#0x10
00b5820c	b.hi 0x00b58164
00b58210	cbz x26,0x00b58240
00b58214	ldr x8,[x23, #0x78]
00b58218	mov x1,x22
00b5821c	mov x2,x26
00b58220	add x8,x23,x8
00b58224	add x0,x8,#0x64
00b58228	bl 0x00c2ffd0
00b5822c	ldr x8,[x23, #0x78]
00b58230	add x8,x8,x26
00b58234	str x8,[x23, #0x78]
00b58238	cbnz x8,0x00b58248
00b5823c	b 0x00b58258
00b58240	ldr x8,[x23, #0x78]
00b58244	cbz x8,0x00b58258
00b58248	mov w9,#0x10
00b5824c	sub x24,x9,x8
00b58250	cmp x24,#0x1
00b58254	b.ls 0x00b582c8
00b58258	adrp x24,0x77c000
00b5825c	add x24,x24,#0x244
00b58260	mov w22,#0x1
00b58264	add x8,x23,x8
00b58268	add x0,x8,#0x64
00b5826c	mov x1,x24
00b58270	mov x2,x22
00b58274	bl 0x00c2ffd0
00b58278	ldr x8,[x23, #0x78]
00b5827c	add x8,x8,x22
00b58280	str x8,[x23, #0x78]
00b58284	cbz x8,0x00b58388
00b58288	add x9,x23,x8
00b5828c	mov w20,#0x10
00b58290	add x0,x9,#0x64
00b58294	sub x2,x20,x8
00b58298	mov w1,wzr
00b5829c	bl 0x00c301c0
00b582a0	ldr x9,[sp, #0x18]
00b582a4	ldr q0,[x9]
00b582a8	stur q0,[x29, #-0x90]
00b582ac	ldr q0,[x9]
00b582b0	stur q0,[x29, #-0x80]
00b582b4	ldr x8,[x23, #0x28]
00b582b8	cmp x8,#0x10
00b582bc	b.ne 0x00b5830c
00b582c0	mov w22,#0x20
00b582c4	b 0x00b58318
00b582c8	adrp x25,0x77c000
00b582cc	add x8,x23,x8
00b582d0	add x25,x25,#0x244
00b582d4	add x0,x8,#0x64
00b582d8	mov x1,x25
00b582dc	mov x2,x24
00b582e0	bl 0x00c2ffd0
00b582e4	ldr x9,[sp, #0x18]
00b582e8	ldr q0,[x9]
00b582ec	stur q0,[x29, #-0x90]
00b582f0	ldr q0,[x9]
00b582f4	stur q0,[x29, #-0x80]
00b582f8	ldr x8,[x23, #0x28]
00b582fc	cmp x8,#0x10
00b58300	b.ne 0x00b5843c
00b58304	mov w22,#0x20
00b58308	b 0x00b58448
00b5830c	ldr q0,[x9]
00b58310	orr w22,wzr,#0x30
00b58314	stur q0,[x29, #-0x70]
00b58318	stur w20,[x29, #-0x5c]
00b5831c	ldp q0,q1,[x29, #-0x90]
00b58320	ldp q2,q3,[x23, #0x80]
00b58324	cmp w22,#0x20
00b58328	eor v0.16B,v2.16B,v0.16B
00b5832c	eor v1.16B,v3.16B,v1.16B
00b58330	stp q0,q1,[x23, #0x80]
00b58334	b.eq 0x00b58360
00b58338	sub x10,x29,#0x90
00b5833c	sub x8,x22,#0x20
00b58340	add x9,x23,#0xa0
00b58344	add x10,x10,#0x20
00b58348	ldrb w11,[x10], #0x1
00b5834c	ldrb w12,[x9]
00b58350	subs x8,x8,#0x1
00b58354	eor w11,w12,w11
00b58358	strb w11,[x9], #0x1
00b5835c	b.ne 0x00b58348
00b58360	ldr x0,[x23, #0x10]
00b58364	sub x2,x29,#0x5c
00b58368	mov x1,x19
00b5836c	mov x3,x19
00b58370	mov w4,w22
00b58374	bl 0x00c36d70
00b58378	cbz w0,0x00b585a0
00b5837c	ldur w8,[x29, #-0x5c]
00b58380	cmp w8,w22
00b58384	b.ne 0x00b585a0
00b58388	ldr x0,[x23]
00b5838c	mov w5,#0xffffffff
00b58390	mov x1,xzr
00b58394	mov x2,xzr
00b58398	mov x3,x19
00b5839c	mov x4,xzr
00b583a0	bl 0x00c34be0
00b583a4	cbz w0,0x00b585a0
00b583a8	ldr x8,[x23, #0x28]
00b583ac	ldr x0,[x23]
00b583b0	sub x2,x29,#0x94
00b583b4	mov w4,#0x10
00b583b8	add x8,x23,x8
00b583bc	add x3,x8,#0x80
00b583c0	mov x1,x19
00b583c4	bl 0x00c36d70
00b583c8	cbz w0,0x00b585a0
00b583cc	ldur w8,[x29, #-0x94]
00b583d0	cmp w8,#0x10
00b583d4	b.ne 0x00b585a0
00b583d8	mov x22,x23
00b583dc	ldr x0,[x22], #0x90
00b583e0	sub x2,x29,#0x94
00b583e4	mov w4,#0x10
00b583e8	mov x3,x19
00b583ec	mov x1,x22
00b583f0	bl 0x00c36d70
00b583f4	cbz w0,0x00b585a0
00b583f8	ldur w8,[x29, #-0x94]
00b583fc	cmp w8,#0x10
00b58400	b.ne 0x00b585a0
00b58404	ldr x8,[x23, #0x28]
00b58408	cmp x8,#0x10
00b5840c	b.eq 0x00b576dc
00b58410	mov x1,x23
00b58414	ldr x0,[x1], #0xa0
00b58418	sub x2,x29,#0x94
00b5841c	mov w4,#0x10
00b58420	mov x3,x22
00b58424	bl 0x00c36d70
00b58428	cbz w0,0x00b585a0
00b5842c	ldur w8,[x29, #-0x94]
00b58430	cmp w8,#0x10
00b58434	b.eq 0x00b576dc
00b58438	b 0x00b585a0
00b5843c	ldr q0,[x9]
00b58440	orr w22,wzr,#0x30
00b58444	stur q0,[x29, #-0x70]
00b58448	mov w8,#0x10
00b5844c	stur w8,[x29, #-0x5c]
00b58450	ldp q0,q1,[x29, #-0x90]
00b58454	ldp q2,q3,[x23, #0x80]
00b58458	cmp w22,#0x20
00b5845c	eor v0.16B,v2.16B,v0.16B
00b58460	eor v1.16B,v3.16B,v1.16B
00b58464	stp q0,q1,[x23, #0x80]
00b58468	b.eq 0x00b58494
00b5846c	sub x10,x29,#0x90
00b58470	sub x8,x22,#0x20
00b58474	add x9,x23,#0xa0
00b58478	add x10,x10,#0x20
00b5847c	ldrb w11,[x10], #0x1
00b58480	ldrb w12,[x9]
00b58484	subs x8,x8,#0x1
00b58488	eor w11,w12,w11
00b5848c	strb w11,[x9], #0x1
00b58490	b.ne 0x00b5847c
00b58494	ldr x0,[x23, #0x10]
00b58498	sub x2,x29,#0x5c
00b5849c	mov x1,x19
00b584a0	mov x3,x19
00b584a4	mov w4,w22
00b584a8	bl 0x00c36d70
00b584ac	cbz w0,0x00b585a0
00b584b0	ldur w8,[x29, #-0x5c]
00b584b4	cmp w8,w22
00b584b8	b.ne 0x00b585a0
00b584bc	mov w8,#0x1
00b584c0	sub x22,x8,x24
00b584c4	cmp x22,#0x10
00b584c8	add x24,x25,x24
00b584cc	str xzr,[x23, #0x78]
00b584d0	b.cc 0x00b585c4
00b584d4	sub x8,x29,#0x90
00b584d8	add x20,x23,#0xa0
00b584dc	add x26,x8,#0x10
00b584e0	add x27,x8,#0x20
00b584e4	mov w28,#0x10
00b584e8	ldr q0,[x24]
00b584ec	ldr q1,[x24]
00b584f0	stur q0,[x29, #-0x90]
00b584f4	str q1,[x26]
00b584f8	ldr x8,[x23, #0x28]
00b584fc	cmp x8,#0x10
00b58500	b.ne 0x00b5850c
00b58504	mov w25,#0x20
00b58508	b 0x00b58518
00b5850c	ldr q0,[x24]
00b58510	orr w25,wzr,#0x30
00b58514	str q0,[x27]
00b58518	stur w28,[x29, #-0x5c]
00b5851c	ldp q0,q1,[x29, #-0x90]
00b58520	ldp q2,q3,[x23, #0x80]
00b58524	cmp w25,#0x20
00b58528	eor v0.16B,v2.16B,v0.16B
00b5852c	eor v1.16B,v3.16B,v1.16B
00b58530	stp q0,q1,[x23, #0x80]
00b58534	b.eq 0x00b5855c
00b58538	sub x8,x25,#0x20
00b5853c	mov x9,x27
00b58540	mov x10,x20
00b58544	ldrb w11,[x9], #0x1
00b58548	ldrb w12,[x10]
00b5854c	subs x8,x8,#0x1
00b58550	eor w11,w12,w11
00b58554	strb w11,[x10], #0x1
00b58558	b.ne 0x00b58544
00b5855c	ldr x0,[x23, #0x10]
00b58560	sub x2,x29,#0x5c
00b58564	mov x1,x19
00b58568	mov x3,x19
00b5856c	mov w4,w25
00b58570	bl 0x00c36d70
00b58574	cbz w0,0x00b585a0
00b58578	ldur w8,[x29, #-0x5c]
00b5857c	cmp w8,w25
00b58580	b.ne 0x00b585a0
00b58584	sub x22,x22,#0x10
00b58588	cmp x22,#0xf
00b5858c	add x24,x24,#0x10
00b58590	b.hi 0x00b584e8
00b58594	ldr x8,[x23, #0x78]
00b58598	cbnz x22,0x00b58264
00b5859c	b 0x00b58284
00b585a0	mov w0,wzr
00b585a4	ldp x29,x30,[sp, #0x130]
00b585a8	ldp x20,x19,[sp, #0x120]
00b585ac	ldp x22,x21,[sp, #0x110]
00b585b0	ldp x24,x23,[sp, #0x100]
00b585b4	ldp x26,x25,[sp, #0xf0]
00b585b8	ldp x28,x27,[sp, #0xe0]
00b585bc	add sp,sp,#0x140
00b585c0	ret
00b585c4	mov x8,xzr
00b585c8	cbnz x22,0x00b58264
00b585cc	b 0x00b58284
