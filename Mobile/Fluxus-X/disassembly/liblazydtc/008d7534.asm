; LZ4_decompress_safe_partial @ 008d7534
008d7534	sub sp,sp,#0x70
008d7538	stp x29,x30,[sp, #0x10]
008d753c	stp x28,x27,[sp, #0x20]
008d7540	stp x26,x25,[sp, #0x30]
008d7544	stp x24,x23,[sp, #0x40]
008d7548	stp x22,x21,[sp, #0x50]
008d754c	stp x20,x19,[sp, #0x60]
008d7550	add x29,sp,#0x10
008d7554	cmp w3,w4
008d7558	mov x21,x0
008d755c	mov w0,#0xffffffff
008d7560	csel w8,w3,w4,lt
008d7564	cbz x21,0x008d7d58
008d7568	tbnz w8,#0x1f,0x008d7d58
008d756c	cbz w8,0x008d7954
008d7570	cbz w2,0x008d7d58
008d7574	add x25,x21,w2, SXTW 
008d7578	add x24,x1,w8, UXTW 
008d757c	mov x20,x1
008d7580	cmp w8,#0x40
008d7584	mov x22,x1
008d7588	str x21,[sp, #0x8]
008d758c	sub x26,x25,#0x10
008d7590	sub x27,x24,#0x20
008d7594	b.cc 0x008d7ce4
008d7598	ldr x21,[sp, #0x8]
008d759c	cmp w2,#0x12
008d75a0	mov x16,x21
008d75a4	ldrb w28,[x16], #0x1
008d75a8	lsr x17,x28,#0x4
008d75ac	b.ge 0x008d75c4
008d75b0	mov x22,x20
008d75b4	cmp x17,#0xf
008d75b8	mov x21,x16
008d75bc	b.eq 0x008d79e8
008d75c0	b 0x008d7a1c
008d75c4	sub x8,x25,#0x11
008d75c8	sub x9,x25,#0xf
008d75cc	sub x10,x24,#0x40
008d75d0	sub x11,x25,#0x40
008d75d4	adrp x12,0x364000
008d75d8	add x12,x12,#0xe30
008d75dc	sub x13,x25,#0x6
008d75e0	adrp x14,0x364000
008d75e4	add x14,x14,#0xdd0
008d75e8	orr w15,wzr,#0x1010101
008d75ec	mov x22,x20
008d75f0	b 0x008d7620
008d75f4	ldr x16,[x1]
008d75f8	str x16,[x0]
008d75fc	ldr x16,[x1, #0x8]
008d7600	str x16,[x0, #0x8]
008d7604	ldrh w16,[x1, #0x10]
008d7608	strh w16,[x0, #0x10]
008d760c	mov x16,x21
008d7610	ldrb w28,[x16], #0x1
008d7614	cmp x16,x8
008d7618	lsr x17,x28,#0x4
008d761c	b.hi 0x008d75b4
008d7620	cmp x17,#0xf
008d7624	b.ne 0x008d7680
008d7628	cmp x16,x9
008d762c	b.cs 0x008d794c
008d7630	ldrb w16,[x16]
008d7634	add x21,x21,#0x2
008d7638	cmp x16,#0xff
008d763c	b.eq 0x008d7764
008d7640	add x17,x16,#0xf
008d7644	cmn x21,x17
008d7648	b.cs 0x008d795c
008d764c	add x0,x22,x17
008d7650	cmp x0,x10
008d7654	b.hi 0x008d7a20
008d7658	add x2,x21,x17
008d765c	cmp x2,x11
008d7660	b.hi 0x008d7a20
008d7664	ldp q1,q0,[x21, #0x20]
008d7668	ldp q2,q3,[x21], #0x40
008d766c	stp q1,q0,[x22, #0x20]
008d7670	stp q2,q3,[x22], #0x40
008d7674	cmp x22,x0
008d7678	b.cc 0x008d7664
008d767c	b 0x008d7690
008d7680	ldr q0,[x16]
008d7684	add x2,x16,x17
008d7688	add x0,x22,x17
008d768c	str q0,[x22]
008d7690	mov x21,x2
008d7694	and x17,x28,#0xf
008d7698	ldrh w16,[x21], #0x2
008d769c	cmp x17,#0xf
008d76a0	sub x1,x0,x16
008d76a4	b.ne 0x008d76dc
008d76a8	cmp x21,x13
008d76ac	b.cs 0x008d795c
008d76b0	ldrb w17,[x2, #0x2]
008d76b4	add x21,x2,#0x3
008d76b8	cmp x17,#0xff
008d76bc	b.eq 0x008d7788
008d76c0	add x17,x17,#0x13
008d76c4	cmn x0,x17
008d76c8	b.cs 0x008d795c
008d76cc	add x2,x0,x17
008d76d0	cmp x2,x10
008d76d4	b.cc 0x008d76fc
008d76d8	b 0x008d7b6c
008d76dc	add x17,x17,#0x4
008d76e0	add x22,x0,x17
008d76e4	cmp x22,x10
008d76e8	b.cs 0x008d7b6c
008d76ec	cmp x1,x20
008d76f0	b.cc 0x008d76fc
008d76f4	cmp w16,#0x8
008d76f8	b.cs 0x008d75f4
008d76fc	cmp x1,x20
008d7700	b.cc 0x008d795c
008d7704	cmp w16,#0xf
008d7708	add x22,x0,x17
008d770c	b.ls 0x008d77ac
008d7710	cmp w16,#0x3f
008d7714	neg x16,x16
008d7718	b.ls 0x008d773c
008d771c	add x17,x0,x16
008d7720	ldp q1,q0,[x17, #0x20]
008d7724	ldp q2,q3,[x17]
008d7728	stp q1,q0,[x0, #0x20]
008d772c	stp q2,q3,[x0], #0x40
008d7730	cmp x0,x22
008d7734	b.cc 0x008d771c
008d7738	b 0x008d760c
008d773c	add x16,x0,x16
008d7740	add x16,x16,#0x10
008d7744	ldur q0,[x16, #-0x10]
008d7748	str q0,[x0]
008d774c	ldr q0,[x16], #0x20
008d7750	str q0,[x0, #0x10]
008d7754	add x0,x0,#0x20
008d7758	cmp x0,x22
008d775c	b.cc 0x008d7744
008d7760	b 0x008d760c
008d7764	cmp x21,x9
008d7768	b.cs 0x008d795c
008d776c	ldrb w17,[x21], #0x1
008d7770	cmp x17,#0xff
008d7774	add x16,x16,x17
008d7778	b.eq 0x008d7764
008d777c	cmn x16,#0x1
008d7780	b.ne 0x008d7640
008d7784	b 0x008d795c
008d7788	cmp x21,x13
008d778c	b.cs 0x008d795c
008d7790	ldrb w2,[x21], #0x1
008d7794	cmp x2,#0xff
008d7798	add x17,x17,x2
008d779c	b.eq 0x008d7788
008d77a0	cmn x17,#0x1
008d77a4	b.ne 0x008d76c0
008d77a8	b 0x008d795c
008d77ac	cmp w16,#0x4
008d77b0	b.eq 0x008d77e4
008d77b4	cmp w16,#0x2
008d77b8	b.eq 0x008d77d4
008d77bc	cmp w16,#0x1
008d77c0	b.ne 0x008d7870
008d77c4	ldrb w1,[x1]
008d77c8	orr x16,x1,x1, LSL #0x8
008d77cc	mul w1,w1,w15
008d77d0	b 0x008d77dc
008d77d4	ldrh w16,[x1]
008d77d8	orr w1,w16,w16, LSL #0x10
008d77dc	mov x2,x16
008d77e0	b 0x008d77f4
008d77e4	ldr w1,[x1]
008d77e8	lsr w2,w1,#0x10
008d77ec	and x16,x1,#0xffff
008d77f0	mov w2,w2
008d77f4	orr x16,x16,x2, LSL #0x10
008d77f8	cmp x17,#0x9
008d77fc	orr x16,x16,x1, LSL #0x20
008d7800	str x16,[x0]
008d7804	b.cc 0x008d760c
008d7808	add x17,x17,x0
008d780c	add x1,x0,#0x10
008d7810	cmp x17,x1
008d7814	csel x17,x17,x1,hi
008d7818	sub x17,x17,x0
008d781c	sub x1,x17,#0x9
008d7820	add x17,x0,#0x8
008d7824	cmp x1,#0x18
008d7828	b.cc 0x008d7860
008d782c	lsr x1,x1,#0x3
008d7830	dup v0.2D,x16
008d7834	add x0,x0,#0x18
008d7838	add x1,x1,#0x1
008d783c	and x2,x1,#0x3ffffffffffffffc
008d7840	add x17,x17,x2, LSL #0x3
008d7844	mov x3,x2
008d7848	subs x3,x3,#0x4
008d784c	stp q0,q0,[x0, #-0x10]
008d7850	add x0,x0,#0x20
008d7854	b.ne 0x008d7848
008d7858	cmp x1,x2
008d785c	b.eq 0x008d760c
008d7860	str x16,[x17], #0x8
008d7864	cmp x17,x22
008d7868	b.cc 0x008d7860
008d786c	b 0x008d760c
008d7870	cmp w16,#0x7
008d7874	b.hi 0x008d78a8
008d7878	str wzr,[x0]
008d787c	ldrh w2,[x1]
008d7880	strh w2,[x0]
008d7884	ldrh w2,[x1, #0x2]
008d7888	strh w2,[x0, #0x2]
008d788c	ldr w2,[x12, x16, LSL #0x2]
008d7890	add x1,x1,x2
008d7894	ldr w2,[x1]
008d7898	str w2,[x0, #0x4]
008d789c	ldrsw x16,[x14, x16, LSL #0x2]
008d78a0	sub x1,x1,x16
008d78a4	b 0x008d78b0
008d78a8	ldr x16,[x1], #0x8
008d78ac	str x16,[x0]
008d78b0	add x16,x17,x0
008d78b4	add x17,x0,#0x10
008d78b8	cmp x16,x17
008d78bc	csel x16,x16,x17,hi
008d78c0	sub x16,x16,x0
008d78c4	sub x17,x16,#0x9
008d78c8	add x16,x0,#0x8
008d78cc	cmp x17,#0x18
008d78d0	b.cs 0x008d78dc
008d78d4	mov x17,x1
008d78d8	b 0x008d7938
008d78dc	sub x2,x0,x1
008d78e0	add x2,x2,#0x8
008d78e4	cmp x2,#0x20
008d78e8	b.cs 0x008d78f4
008d78ec	mov x17,x1
008d78f0	b 0x008d7938
008d78f4	lsr x17,x17,#0x3
008d78f8	add x0,x0,#0x18
008d78fc	add x2,x17,#0x1
008d7900	and x3,x2,#0x3ffffffffffffffc
008d7904	lsl x4,x3,#0x3
008d7908	add x17,x1,x4
008d790c	add x16,x16,x4
008d7910	add x1,x1,#0x10
008d7914	mov x4,x3
008d7918	ldp q0,q1,[x1, #-0x10]
008d791c	subs x4,x4,#0x4
008d7920	add x1,x1,#0x20
008d7924	stp q0,q1,[x0, #-0x10]
008d7928	add x0,x0,#0x20
008d792c	b.ne 0x008d7918
008d7930	cmp x2,x3
008d7934	b.eq 0x008d760c
008d7938	ldr x0,[x17], #0x8
008d793c	str x0,[x16], #0x8
008d7940	cmp x16,x22
008d7944	b.cc 0x008d7938
008d7948	b 0x008d760c
008d794c	mov x21,x16
008d7950	b 0x008d795c
008d7954	mov w0,wzr
008d7958	b 0x008d7d58
008d795c	ldr x9,[sp, #0x8]
008d7960	mvn w8,w21
008d7964	add w0,w8,w9
008d7968	b 0x008d7d58
008d796c	cmp x21,x26
008d7970	b.cs 0x008d7a1c
008d7974	cmp x22,x27
008d7978	b.hi 0x008d7a1c
008d797c	ldr q0,[x21]
008d7980	add x8,x21,x17
008d7984	and x9,x28,#0xf
008d7988	mov x21,x8
008d798c	add x0,x22,x17
008d7990	cmp x9,#0xf
008d7994	str q0,[x22]
008d7998	ldrh w16,[x21], #0x2
008d799c	sub x1,x0,x16
008d79a0	b.eq 0x008d7b28
008d79a4	cmp w16,#0x8
008d79a8	b.cc 0x008d7b28
008d79ac	cmp x1,x20
008d79b0	b.cc 0x008d7b28
008d79b4	ldr x10,[x1]
008d79b8	add x9,x0,x9
008d79bc	add x21,x8,#0x3
008d79c0	add x22,x9,#0x4
008d79c4	str x10,[x0]
008d79c8	ldr x10,[x1, #0x8]
008d79cc	str x10,[x0, #0x8]
008d79d0	ldrh w10,[x1, #0x10]
008d79d4	strh w10,[x0, #0x10]
008d79d8	ldrb w28,[x8, #0x2]
008d79dc	lsr x17,x28,#0x4
008d79e0	cmp x17,#0xf
008d79e4	b.ne 0x008d796c
008d79e8	sub x9,x25,#0xf
008d79ec	cmp x21,x9
008d79f0	b.cs 0x008d795c
008d79f4	ldrb w8,[x21], #0x1
008d79f8	cmp x8,#0xff
008d79fc	b.eq 0x008d7d78
008d7a00	add x17,x8,#0xf
008d7a04	cmn x22,x17
008d7a08	cset w9,cs
008d7a0c	cmn x21,x17
008d7a10	cset w8,cs
008d7a14	tbnz w9,#0x0,0x008d795c
008d7a18	tbnz w8,#0x0,0x008d795c
008d7a1c	add x0,x22,x17
008d7a20	sub x8,x24,#0xc
008d7a24	cmp x0,x8
008d7a28	b.hi 0x008d7a3c
008d7a2c	add x8,x21,x17
008d7a30	sub x9,x25,#0x8
008d7a34	cmp x8,x9
008d7a38	b.ls 0x008d7a90
008d7a3c	add x8,x21,x17
008d7a40	sub x9,x25,x21
008d7a44	add x10,x22,x9
008d7a48	cmp x8,x25
008d7a4c	csel x19,x10,x0,hi
008d7a50	cmp x19,x24
008d7a54	b.hi 0x008d7d40
008d7a58	cmp x8,x25
008d7a5c	mov x0,x22
008d7a60	mov x1,x21
008d7a64	csel x23,x9,x17,hi
008d7a68	mov x2,x23
008d7a6c	bl 0x00c2ff60
008d7a70	cmp x19,x24
008d7a74	add x0,x22,x23
008d7a78	b.eq 0x008d7d54
008d7a7c	add x8,x21,x23
008d7a80	sub x9,x25,#0x2
008d7a84	cmp x8,x9
008d7a88	b.cc 0x008d7b18
008d7a8c	b 0x008d7d54
008d7a90	add x9,x22,#0x8
008d7a94	mvn x10,x22
008d7a98	cmp x0,x9
008d7a9c	csel x9,x0,x9,hi
008d7aa0	add x9,x9,x10
008d7aa4	cmp x9,#0x18
008d7aa8	b.cc 0x008d7b00
008d7aac	sub x10,x22,x21
008d7ab0	cmp x10,#0x20
008d7ab4	b.cc 0x008d7b00
008d7ab8	lsr x9,x9,#0x3
008d7abc	add x13,x22,#0x10
008d7ac0	add x14,x21,#0x10
008d7ac4	add x11,x9,#0x1
008d7ac8	and x12,x11,#0x3ffffffffffffffc
008d7acc	lsl x10,x12,#0x3
008d7ad0	mov x15,x12
008d7ad4	add x9,x21,x10
008d7ad8	add x10,x22,x10
008d7adc	ldp q0,q1,[x14, #-0x10]
008d7ae0	subs x15,x15,#0x4
008d7ae4	add x14,x14,#0x20
008d7ae8	stp q0,q1,[x13, #-0x10]
008d7aec	add x13,x13,#0x20
008d7af0	b.ne 0x008d7adc
008d7af4	cmp x11,x12
008d7af8	b.ne 0x008d7b08
008d7afc	b 0x008d7b18
008d7b00	mov x9,x21
008d7b04	mov x10,x22
008d7b08	ldr x11,[x9], #0x8
008d7b0c	str x11,[x10], #0x8
008d7b10	cmp x10,x0
008d7b14	b.cc 0x008d7b08
008d7b18	ldrh w16,[x8], #0x2
008d7b1c	and x9,x28,#0xf
008d7b20	mov x21,x8
008d7b24	sub x1,x0,x16
008d7b28	cmp x9,#0xf
008d7b2c	b.ne 0x008d7b68
008d7b30	sub x9,x25,#0x6
008d7b34	cmp x21,x9
008d7b38	b.cs 0x008d795c
008d7b3c	ldrb w8,[x21], #0x1
008d7b40	cmp x8,#0xff
008d7b44	b.eq 0x008d7d9c
008d7b48	add x9,x8,#0xf
008d7b4c	cmn x0,x9
008d7b50	cset w10,cs
008d7b54	cmn x8,#0x1
008d7b58	mov w8,#0xf
008d7b5c	csel x9,x8,x9,eq
008d7b60	b.eq 0x008d795c
008d7b64	tbnz w10,#0x0,0x008d795c
008d7b68	add x17,x9,#0x4
008d7b6c	cmp x1,x20
008d7b70	b.cc 0x008d795c
008d7b74	add x22,x0,x17
008d7b78	sub x8,x24,#0xc
008d7b7c	cmp x22,x8
008d7b80	b.ls 0x008d7c4c
008d7b84	sub x8,x24,x0
008d7b88	cmp x17,x8
008d7b8c	csel x2,x17,x8,cc
008d7b90	add x8,x1,x2
008d7b94	add x22,x0,x2
008d7b98	cmp x8,x0
008d7b9c	b.ls 0x008d7cbc
008d7ba0	cbz x2,0x008d7cdc
008d7ba4	add x8,x2,x0
008d7ba8	add x9,x0,#0x1
008d7bac	cmp x8,x9
008d7bb0	csinc x8,x8,x0,hi
008d7bb4	sub x8,x8,x0
008d7bb8	cmp x8,#0x8
008d7bbc	b.cc 0x008d7cc4
008d7bc0	sub x9,x0,x1
008d7bc4	cmp x9,#0x20
008d7bc8	b.cc 0x008d7cc4
008d7bcc	cmp x8,#0x20
008d7bd0	mov x11,xzr
008d7bd4	b.cc 0x008d7c18
008d7bd8	and x11,x8,#-0x20
008d7bdc	add x9,x1,#0x10
008d7be0	add x10,x0,#0x10
008d7be4	mov x12,x11
008d7be8	ldp q0,q1,[x9, #-0x10]
008d7bec	subs x12,x12,#0x20
008d7bf0	add x9,x9,#0x20
008d7bf4	stp q0,q1,[x10, #-0x10]
008d7bf8	add x10,x10,#0x20
008d7bfc	b.ne 0x008d7be8
008d7c00	cmp x8,x11
008d7c04	b.eq 0x008d7cdc
008d7c08	tst x8,#0x18
008d7c0c	add x9,x0,x11
008d7c10	add x10,x1,x11
008d7c14	b.eq 0x008d7ccc
008d7c18	and x12,x8,#-0x8
008d7c1c	add x13,x1,x11
008d7c20	add x14,x0,x11
008d7c24	add x9,x0,x12
008d7c28	add x10,x1,x12
008d7c2c	sub x11,x11,x12
008d7c30	ldr d0,[x13], #0x8
008d7c34	adds x11,x11,#0x8
008d7c38	str d0,[x14], #0x8
008d7c3c	b.ne 0x008d7c30
008d7c40	cmp x8,x12
008d7c44	b.ne 0x008d7ccc
008d7c48	b 0x008d7cdc
008d7c4c	cmp x16,#0x7
008d7c50	b.ls 0x008d7db8
008d7c54	ldr x8,[x1], #0x8
008d7c58	str x8,[x0]
008d7c5c	ldr x8,[x1]
008d7c60	cmp x17,#0x11
008d7c64	str x8,[x0, #0x8]
008d7c68	b.cc 0x008d7ce4
008d7c6c	add x8,x17,x0
008d7c70	add x9,x0,#0x18
008d7c74	cmp x8,x9
008d7c78	csel x8,x8,x9,hi
008d7c7c	sub x8,x8,x0
008d7c80	sub x9,x8,#0x11
008d7c84	add x8,x0,#0x10
008d7c88	cmp x9,#0x28
008d7c8c	b.cc 0x008d7ca0
008d7c90	sub x10,x0,x1
008d7c94	add x10,x10,#0x8
008d7c98	cmp x10,#0x20
008d7c9c	b.cs 0x008d7cf8
008d7ca0	mov x9,x1
008d7ca4	add x9,x9,#0x8
008d7ca8	ldr x10,[x9], #0x8
008d7cac	str x10,[x8], #0x8
008d7cb0	cmp x8,x22
008d7cb4	b.cc 0x008d7ca8
008d7cb8	b 0x008d7ce4
008d7cbc	bl 0x00c2ffd0
008d7cc0	b 0x008d7cdc
008d7cc4	mov x9,x0
008d7cc8	mov x10,x1
008d7ccc	ldrb w8,[x10], #0x1
008d7cd0	strb w8,[x9], #0x1
008d7cd4	cmp x9,x22
008d7cd8	b.cc 0x008d7ccc
008d7cdc	cmp x22,x24
008d7ce0	b.eq 0x008d7d50
008d7ce4	ldrb w28,[x21], #0x1
008d7ce8	lsr x17,x28,#0x4
008d7cec	cmp x17,#0xf
008d7cf0	b.ne 0x008d796c
008d7cf4	b 0x008d79e8
008d7cf8	lsr x9,x9,#0x3
008d7cfc	add x13,x1,#0x18
008d7d00	add x10,x9,#0x1
008d7d04	and x11,x10,#0x3ffffffffffffffc
008d7d08	lsl x12,x11,#0x3
008d7d0c	mov x14,x11
008d7d10	add x9,x1,x12
008d7d14	add x8,x8,x12
008d7d18	add x12,x0,#0x20
008d7d1c	ldp q0,q1,[x13, #-0x10]
008d7d20	subs x14,x14,#0x4
008d7d24	add x13,x13,#0x20
008d7d28	stp q0,q1,[x12, #-0x10]
008d7d2c	add x12,x12,#0x20
008d7d30	b.ne 0x008d7d1c
008d7d34	cmp x10,x11
008d7d38	b.eq 0x008d7ce4
008d7d3c	b 0x008d7ca4
008d7d40	sub x2,x24,x22
008d7d44	mov x0,x22
008d7d48	mov x1,x21
008d7d4c	bl 0x00c2ff60
008d7d50	mov x0,x24
008d7d54	sub w0,w0,w20
008d7d58	ldp x20,x19,[sp, #0x60]
008d7d5c	ldp x22,x21,[sp, #0x50]
008d7d60	ldp x24,x23,[sp, #0x40]
008d7d64	ldp x26,x25,[sp, #0x30]
008d7d68	ldp x28,x27,[sp, #0x20]
008d7d6c	ldp x29,x30,[sp, #0x10]
008d7d70	add sp,sp,#0x70
008d7d74	ret
008d7d78	cmp x21,x9
008d7d7c	b.cs 0x008d795c
008d7d80	ldrb w10,[x21], #0x1
008d7d84	cmp x10,#0xff
008d7d88	add x8,x8,x10
008d7d8c	b.eq 0x008d7d78
008d7d90	cmn x8,#0x1
008d7d94	b.ne 0x008d7a00
008d7d98	b 0x008d795c
008d7d9c	cmp x21,x9
008d7da0	b.cs 0x008d795c
008d7da4	ldrb w10,[x21], #0x1
008d7da8	cmp x10,#0xff
008d7dac	add x8,x8,x10
008d7db0	b.eq 0x008d7d9c
008d7db4	b 0x008d7b48
008d7db8	str wzr,[x0]
008d7dbc	ldrb w8,[x1]
008d7dc0	strb w8,[x0]
008d7dc4	ldrb w8,[x1, #0x1]
008d7dc8	strb w8,[x0, #0x1]
008d7dcc	ldrb w8,[x1, #0x2]
008d7dd0	strb w8,[x0, #0x2]
008d7dd4	ldrb w8,[x1, #0x3]
008d7dd8	strb w8,[x0, #0x3]
008d7ddc	adrp x8,0x364000
008d7de0	add x8,x8,#0xe30
008d7de4	ldr w8,[x8, x16, LSL #0x2]
008d7de8	add x8,x1,x8
008d7dec	ldr w9,[x8]
008d7df0	str w9,[x0, #0x4]
008d7df4	adrp x9,0x364000
008d7df8	add x9,x9,#0xdd0
008d7dfc	ldrsw x9,[x9, x16, LSL #0x2]
008d7e00	sub x1,x8,x9
008d7e04	b 0x008d7c5c
