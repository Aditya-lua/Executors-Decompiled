; std::__ndk1::__num_put<char>::__widen_and_group_float @ 00be7494
00be7494	paciasp
00be7498	sub sp,sp,#0xb0
00be749c	stp x29,x30,[sp, #0x50]
00be74a0	stp x28,x27,[sp, #0x60]
00be74a4	stp x26,x25,[sp, #0x70]
00be74a8	stp x24,x23,[sp, #0x80]
00be74ac	stp x22,x21,[sp, #0x90]
00be74b0	stp x20,x19,[sp, #0xa0]
00be74b4	add x29,sp,#0x50
00be74b8	adrp x23,0xcb4000
00be74bc	mov x19,x6
00be74c0	mov x20,x5
00be74c4	ldr x23,[x23, #0x998]
00be74c8	ldr x22,[x6]
00be74cc	mov x24,x4
00be74d0	mov x26,x3
00be74d4	mov x21,x2
00be74d8	mov x27,x1
00be74dc	stur x23,[x29, #-0x10]
00be74e0	ldar x8,[x23]
00be74e4	str x0,[sp, #0x20]
00be74e8	cmn x8,#0x1
00be74ec	b.eq 0x00be7518
00be74f0	sub x8,x29,#0x10
00be74f4	add x9,sp,#0x28
00be74f8	adrp x0,0xcb4000
00be74fc	str x8,[sp, #0x28]
00be7500	nop
00be7504	adr x2,0xc0bab0
00be7508	stur x9,[x29, #-0x8]
00be750c	sub x1,x29,#0x8
00be7510	ldr x0,[x0, #0x998]
00be7514	bl 0x00c305d0
00be7518	ldp x8,x10,[x22, #0x10]
00be751c	ldrsw x9,[x23, #0x8]
00be7520	sub x9,x9,#0x1
00be7524	sub x10,x10,x8
00be7528	cmp x9,x10, ASR #0x3
00be752c	b.cs 0x00be7b7c
00be7530	ldr x25,[x8, x9, LSL #0x3]
00be7534	cbz x25,0x00be7b7c
00be7538	adrp x22,0xcb5000
00be753c	ldr x22,[x22, #0xc00]
00be7540	ldr x19,[x19]
00be7544	stur x22,[x29, #-0x10]
00be7548	ldar x8,[x22]
00be754c	cmn x8,#0x1
00be7550	b.eq 0x00be757c
00be7554	sub x8,x29,#0x10
00be7558	add x9,sp,#0x28
00be755c	adrp x0,0xcb5000
00be7560	str x8,[sp, #0x28]
00be7564	nop
00be7568	adr x2,0xc0bab0
00be756c	stur x9,[x29, #-0x8]
00be7570	sub x1,x29,#0x8
00be7574	ldr x0,[x0, #0xc00]
00be7578	bl 0x00c305d0
00be757c	ldp x8,x10,[x19, #0x10]
00be7580	ldrsw x9,[x22, #0x8]
00be7584	sub x9,x9,#0x1
00be7588	sub x10,x10,x8
00be758c	cmp x9,x10, ASR #0x3
00be7590	b.cs 0x00be7b7c
00be7594	ldr x23,[x8, x9, LSL #0x3]
00be7598	cbz x23,0x00be7b7c
00be759c	ldr x8,[x23]
00be75a0	mov x0,x23
00be75a4	ldr x9,[x8, #0x28]
00be75a8	add x8,sp,#0x28
00be75ac	blr x9
00be75b0	ldr x19,[sp, #0x20]
00be75b4	str x26,[x20]
00be75b8	str x26,[sp, #0x18]
00be75bc	ldrb w1,[x19]
00be75c0	cmp w1,#0x2d
00be75c4	b.eq 0x00be75d4
00be75c8	cmp w1,#0x2b
00be75cc	mov x28,x19
00be75d0	b.ne 0x00be75f8
00be75d4	ldr x8,[x25]
00be75d8	ldr x8,[x8, #0x38]
00be75dc	mov x0,x25
00be75e0	blr x8
00be75e4	ldr x8,[x20]
00be75e8	add x28,x19,#0x1
00be75ec	add x9,x8,#0x1
00be75f0	str x9,[x20]
00be75f4	strb w0,[x8]
00be75f8	sub x22,x21,x28
00be75fc	stp x27,x24,[sp, #0x8]
00be7600	cmp x22,#0x2
00be7604	b.lt 0x00be76f8
00be7608	ldrb w8,[x28]
00be760c	cmp w8,#0x30
00be7610	b.ne 0x00be76f8
00be7614	ldrb w8,[x28, #0x1]
00be7618	orr w8,w8,#0x20
00be761c	cmp w8,#0x78
00be7620	b.ne 0x00be76f8
00be7624	ldr x8,[x25]
00be7628	ldr x8,[x8, #0x38]
00be762c	mov x0,x25
00be7630	mov w1,#0x30
00be7634	blr x8
00be7638	ldr x8,[x20]
00be763c	add x9,x8,#0x1
00be7640	str x9,[x20]
00be7644	strb w0,[x8]
00be7648	ldr x8,[x25]
00be764c	ldrb w1,[x28, #0x1]
00be7650	ldr x8,[x8, #0x38]
00be7654	mov x0,x25
00be7658	blr x8
00be765c	ldr x8,[x20]
00be7660	add x26,x28,#0x2
00be7664	cmp x26,x21
00be7668	add x9,x8,#0x1
00be766c	str x9,[x20]
00be7670	strb w0,[x8]
00be7674	b.cs 0x00be799c
00be7678	adrp x19,0xd27000
00be767c	add x19,x19,#0xf8
00be7680	add x22,x28,x22
00be7684	adrp x28,0xd27000
00be7688	mov x27,x26
00be768c	b 0x00be769c
00be7690	add x27,x27,#0x1
00be7694	cmp x27,x21
00be7698	b.eq 0x00be79a4
00be769c	ldrb w24,[x27]
00be76a0	ldarb w8,[x19]
00be76a4	tbz w8,#0x0,0x00be76c8
00be76a8	sub w8,w24,#0x3a
00be76ac	cmn w8,#0xb
00be76b0	b.hi 0x00be7690
00be76b4	orr w8,w24,#0x20
00be76b8	sub w8,w8,#0x67
00be76bc	cmn w8,#0x6
00be76c0	b.cs 0x00be7690
00be76c4	b 0x00be7780
00be76c8	mov x0,x19
00be76cc	bl 0x00c2fe90
00be76d0	adrp x1,0x2c6000
00be76d4	add x1,x1,#0xbfc
00be76d8	cbz w0,0x00be76a8
00be76dc	mov w0,#0x1fbf
00be76e0	mov x2,xzr
00be76e4	bl 0x00c43890
00be76e8	str x0,[x28, #0xf0]
00be76ec	mov x0,x19
00be76f0	bl 0x00c2fea0
00be76f4	b 0x00be76a8
00be76f8	cmp x28,x21
00be76fc	b.cs 0x00be776c
00be7700	adrp x19,0xd27000
00be7704	add x19,x19,#0xf8
00be7708	add x22,x28,x22
00be770c	adrp x24,0xd27000
00be7710	mov x27,x28
00be7714	ldrb w26,[x27]
00be7718	ldarb w8,[x19]
00be771c	tbz w8,#0x0,0x00be773c
00be7720	sub w8,w26,#0x3a
00be7724	cmn w8,#0xa
00be7728	b.cc 0x00be777c
00be772c	add x27,x27,#0x1
00be7730	cmp x27,x21
00be7734	b.ne 0x00be7714
00be7738	b 0x00be7778
00be773c	mov x0,x19
00be7740	bl 0x00c2fe90
00be7744	adrp x1,0x2c6000
00be7748	add x1,x1,#0xbfc
00be774c	cbz w0,0x00be7720
00be7750	mov w0,#0x1fbf
00be7754	mov x2,xzr
00be7758	bl 0x00c43890
00be775c	str x0,[x24, #0xf0]
00be7760	mov x0,x19
00be7764	bl 0x00c2fea0
00be7768	b 0x00be7720
00be776c	mov x27,x28
00be7770	mov x26,x28
00be7774	b 0x00be7784
00be7778	mov x27,x22
00be777c	mov x26,x28
00be7780	ldr x19,[sp, #0x20]
00be7784	ldrb w8,[sp, #0x28]
00be7788	ldr x9,[sp, #0x30]
00be778c	str x23,[sp]
00be7790	lsr x10,x8,#0x1
00be7794	tst w8,#0x1
00be7798	csel x8,x10,x9,eq
00be779c	cbz x8,0x00be796c
00be77a0	cmp x26,x27
00be77a4	b.eq 0x00be77d4
00be77a8	sub x8,x27,#0x1
00be77ac	cmp x26,x8
00be77b0	b.cs 0x00be77d4
00be77b4	add x9,x26,#0x1
00be77b8	ldrb w10,[x8]
00be77bc	ldurb w11,[x9, #-0x1]
00be77c0	sturb w10,[x9, #-0x1]
00be77c4	strb w11,[x8], #-0x1
00be77c8	cmp x9,x8
00be77cc	add x9,x9,#0x1
00be77d0	b.cc 0x00be77b8
00be77d4	ldr x8,[x23]
00be77d8	ldr x8,[x8, #0x20]
00be77dc	mov x0,x23
00be77e0	blr x8
00be77e4	cmp x26,x27
00be77e8	b.cs 0x00be78a0
00be77ec	add x8,sp,#0x28
00be77f0	mov w19,w0
00be77f4	mov w28,wzr
00be77f8	mov w22,wzr
00be77fc	orr x24,x8,#0x1
00be7800	mov x23,x26
00be7804	ldrb w8,[sp, #0x28]
00be7808	ldr x9,[sp, #0x38]
00be780c	tst w8,#0x1
00be7810	mov w8,w28
00be7814	csel x10,x24,x9,eq
00be7818	ldrb w10,[x10, x8]
00be781c	cbz w10,0x00be786c
00be7820	ldrb w10,[sp, #0x28]
00be7824	tst w10,#0x1
00be7828	csel x9,x24,x9,eq
00be782c	ldrb w9,[x9, x8]
00be7830	cmp w22,w9
00be7834	b.ne 0x00be786c
00be7838	ldr x9,[x20]
00be783c	mov w22,wzr
00be7840	add x10,x9,#0x1
00be7844	str x10,[x20]
00be7848	strb w19,[x9]
00be784c	ldrb w9,[sp, #0x28]
00be7850	ldr x10,[sp, #0x30]
00be7854	lsr x11,x9,#0x1
00be7858	tst w9,#0x1
00be785c	csel x9,x11,x10,eq
00be7860	sub x9,x9,#0x1
00be7864	cmp x9,x8
00be7868	cinc w28,w28,hi
00be786c	ldr x8,[x25]
00be7870	ldrb w1,[x23]
00be7874	ldr x8,[x8, #0x38]
00be7878	mov x0,x25
00be787c	blr x8
00be7880	ldr x8,[x20]
00be7884	add x23,x23,#0x1
00be7888	add w22,w22,#0x1
00be788c	cmp x23,x27
00be7890	add x9,x8,#0x1
00be7894	str x9,[x20]
00be7898	strb w0,[x8]
00be789c	b.ne 0x00be7804
00be78a0	ldp x0,x19,[sp, #0x18]
00be78a4	ldr x11,[x20]
00be78a8	sub x13,x26,x19
00be78ac	add x9,x0,x13
00be78b0	cmp x9,x11
00be78b4	b.eq 0x00be7a88
00be78b8	sub x8,x11,#0x1
00be78bc	cmp x9,x8
00be78c0	b.cs 0x00be7a88
00be78c4	add x10,x26,x0
00be78c8	sub x15,x11,#0x2
00be78cc	sub x12,x10,x19
00be78d0	mvn x10,x26
00be78d4	add x14,x12,#0x1
00be78d8	add x16,x19,x10
00be78dc	cmp x14,x15
00be78e0	csinc x17,x15,x12,ls
00be78e4	add x10,x17,x16
00be78e8	cmp x10,x0
00be78ec	cinc x17,x0,ne
00be78f0	cmp x10,x0
00be78f4	sub x17,x10,x17
00be78f8	lsr x17,x17,#0x1
00be78fc	cinc x10,x17,ne
00be7900	add x10,x10,#0x1
00be7904	cmp x10,#0x8
00be7908	b.cc 0x00be7a68
00be790c	cmp x14,x15
00be7910	csinc x12,x15,x12,ls
00be7914	add x12,x12,x16
00be7918	cmp x12,x0
00be791c	cinc x14,x0,ne
00be7920	cmp x12,x0
00be7924	sub x12,x12,x14
00be7928	cinc x15,x26,ne
00be792c	lsr x14,x12,#0x1
00be7930	cinc x12,x14,ne
00be7934	cmp x9,x11
00be7938	b.cs 0x00be795c
00be793c	add x14,x15,x14
00be7940	mvn x12,x12
00be7944	sub x14,x14,x19
00be7948	add x12,x11,x12
00be794c	add x14,x14,x0
00be7950	add x14,x14,#0x1
00be7954	cmp x12,x14
00be7958	b.cc 0x00be7a68
00be795c	cmp x10,#0x20
00be7960	b.cs 0x00be79ac
00be7964	mov x12,xzr
00be7968	b 0x00be7a10
00be796c	ldr x8,[x25]
00be7970	ldr x3,[x20]
00be7974	ldr x8,[x8, #0x40]
00be7978	mov x0,x25
00be797c	mov x1,x26
00be7980	mov x2,x27
00be7984	blr x8
00be7988	ldr x8,[x20]
00be798c	sub x9,x27,x26
00be7990	add x8,x8,x9
00be7994	str x8,[x20]
00be7998	b 0x00be7a88
00be799c	mov x27,x26
00be79a0	b 0x00be7784
00be79a4	mov x27,x22
00be79a8	b 0x00be7780
00be79ac	and x12,x10,#-0x20
00be79b0	add x14,x13,x0
00be79b4	sub x13,x11,#0x10
00be79b8	add x14,x14,#0x10
00be79bc	mov x15,x12
00be79c0	ldp q1,q0,[x13, #-0x10]
00be79c4	subs x15,x15,#0x20
00be79c8	ldp q2,q3,[x14, #-0x10]
00be79cc	rev64 v0.16B,v0.16B
00be79d0	rev64 v1.16B,v1.16B
00be79d4	rev64 v2.16B,v2.16B
00be79d8	rev64 v3.16B,v3.16B
00be79dc	ext v0.16B,v0.16B,v0.16B,0x8
00be79e0	ext v1.16B,v1.16B,v1.16B,0x8
00be79e4	ext v2.16B,v2.16B,v2.16B,0x8
00be79e8	ext v3.16B,v3.16B,v3.16B,0x8
00be79ec	stp q0,q1,[x14, #-0x10]
00be79f0	add x14,x14,#0x20
00be79f4	stp q3,q2,[x13, #-0x10]
00be79f8	sub x13,x13,#0x20
00be79fc	b.ne 0x00be79c0
00be7a00	cmp x10,x12
00be7a04	b.eq 0x00be7a88
00be7a08	tst x10,#0x18
00be7a0c	b.eq 0x00be7a60
00be7a10	add x14,x12,x26
00be7a14	and x13,x10,#-0x8
00be7a18	sub x15,x11,x12
00be7a1c	sub x14,x14,x19
00be7a20	sub x8,x8,x13
00be7a24	add x9,x9,x13
00be7a28	add x11,x0,x14
00be7a2c	sub x12,x12,x13
00be7a30	sub x14,x15,#0x8
00be7a34	ldr d0,[x14]
00be7a38	ldr d1,[x11]
00be7a3c	adds x12,x12,#0x8
00be7a40	rev64 v0.8B,v0.8B
00be7a44	rev64 v1.8B,v1.8B
00be7a48	str d0,[x11], #0x8
00be7a4c	str d1,[x14], #-0x8
00be7a50	b.ne 0x00be7a34
00be7a54	cmp x10,x13
00be7a58	b.ne 0x00be7a68
00be7a5c	b 0x00be7a88
00be7a60	sub x8,x8,x12
00be7a64	add x9,x9,x12
00be7a68	add x9,x9,#0x1
00be7a6c	ldrb w10,[x8]
00be7a70	ldurb w11,[x9, #-0x1]
00be7a74	sturb w10,[x9, #-0x1]
00be7a78	strb w11,[x8], #-0x1
00be7a7c	cmp x9,x8
00be7a80	add x9,x9,#0x1
00be7a84	b.cc 0x00be7a6c
00be7a88	cmp x27,x21
00be7a8c	b.cs 0x00be7af4
00be7a90	ldr x22,[sp]
00be7a94	ldrb w1,[x27]
00be7a98	cmp w1,#0x2e
00be7a9c	b.eq 0x00be7ad0
00be7aa0	ldr x8,[x25]
00be7aa4	ldr x8,[x8, #0x38]
00be7aa8	mov x0,x25
00be7aac	blr x8
00be7ab0	ldr x8,[x20]
00be7ab4	add x27,x27,#0x1
00be7ab8	cmp x27,x21
00be7abc	add x9,x8,#0x1
00be7ac0	str x9,[x20]
00be7ac4	strb w0,[x8]
00be7ac8	b.ne 0x00be7a94
00be7acc	b 0x00be7af4
00be7ad0	ldr x8,[x22]
00be7ad4	ldr x8,[x8, #0x18]
00be7ad8	mov x0,x22
00be7adc	blr x8
00be7ae0	ldr x8,[x20]
00be7ae4	add x27,x27,#0x1
00be7ae8	add x9,x8,#0x1
00be7aec	str x9,[x20]
00be7af0	strb w0,[x8]
00be7af4	ldr x8,[x25]
00be7af8	ldr x3,[x20]
00be7afc	ldr x8,[x8, #0x40]
00be7b00	mov x0,x25
00be7b04	mov x1,x27
00be7b08	mov x2,x21
00be7b0c	blr x8
00be7b10	ldr x8,[x20]
00be7b14	sub x9,x21,x27
00be7b18	ldr x11,[sp, #0x8]
00be7b1c	add x8,x8,x9
00be7b20	ldr x9,[sp, #0x18]
00be7b24	sub x10,x11,x19
00be7b28	cmp x11,x21
00be7b2c	str x8,[x20]
00be7b30	add x9,x9,x10
00be7b34	ldrb w10,[sp, #0x28]
00be7b38	csel x8,x8,x9,eq
00be7b3c	ldr x9,[sp, #0x10]
00be7b40	str x8,[x9]
00be7b44	tbz w10,#0x0,0x00be7b58
00be7b48	ldr x8,[sp, #0x28]
00be7b4c	ldr x0,[sp, #0x38]
00be7b50	and x1,x8,#-0x2
00be7b54	bl 0x00c2fe80
00be7b58	ldp x20,x19,[sp, #0xa0]
00be7b5c	ldp x22,x21,[sp, #0x90]
00be7b60	ldp x24,x23,[sp, #0x80]
00be7b64	ldp x26,x25,[sp, #0x70]
00be7b68	ldp x28,x27,[sp, #0x60]
00be7b6c	ldp x29,x30,[sp, #0x50]
00be7b70	add sp,sp,#0xb0
00be7b74	autiasp
00be7b78	ret
00be7b7c	bl 0x00bd8968
