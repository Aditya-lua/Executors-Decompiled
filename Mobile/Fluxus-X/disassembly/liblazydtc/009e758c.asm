; tls_construct_server_key_exchange @ 009e758c
009e758c	sub sp,sp,#0xe0
009e7590	stp x29,x30,[sp, #0xd0]
009e7594	add x29,sp,#0xd0
009e7598	stp x28,x27,[sp, #0x80]
009e759c	stp x26,x25,[sp, #0x90]
009e75a0	stp x24,x23,[sp, #0xa0]
009e75a4	stp x22,x21,[sp, #0xb0]
009e75a8	stp x20,x19,[sp, #0xc0]
009e75ac	stur xzr,[x29, #-0x58]
009e75b0	ldr x25,[x0, #0x380]
009e75b4	mov x20,x0
009e75b8	mov x21,x1
009e75bc	bl 0x00c31fa0
009e75c0	mov x19,x0
009e75c4	add x1,sp,#0x40
009e75c8	mov x0,x21
009e75cc	str xzr,[sp, #0x50]
009e75d0	bl 0x00c34370
009e75d4	cbz w0,0x009e7668
009e75d8	cbz x19,0x009e7694
009e75dc	ldr x8,[x20, #0x2e0]
009e75e0	movi v0.2D,#0x0
009e75e4	ldr w27,[x8, #0x1c]
009e75e8	mov w8,#0x48
009e75ec	stur q0,[sp, #0x68]
009e75f0	stur q0,[sp, #0x58]
009e75f4	tst x27,x8
009e75f8	b.eq 0x009e76d4
009e75fc	mov w26,wzr
009e7600	mov w23,wzr
009e7604	mov x24,xzr
009e7608	ldr x8,[x20, #0x2e0]
009e760c	mov x22,xzr
009e7610	ldrb w9,[x8, #0x20]
009e7614	tst w9,#0x44444444
009e7618	b.ne 0x009e7638
009e761c	ldrh w8,[x8, #0x1c]
009e7620	mov w9,#0x1c8
009e7624	mov x22,xzr
009e7628	tst w8,w9
009e762c	b.ne 0x009e7638
009e7630	mov x22,x25
009e7634	cbz x25,0x009e7b08
009e7638	mov w8,#0x1c8
009e763c	tst x27,x8
009e7640	b.eq 0x009e7734
009e7644	ldr x8,[x20, #0x898]
009e7648	ldr x25,[x8, #0x200]
009e764c	cbz x25,0x009e771c
009e7650	mov x0,x25
009e7654	bl 0x00c2ff50
009e7658	mov x2,x0
009e765c	cmp x0,#0x100
009e7660	b.ls 0x009e7720
009e7664	b 0x009e7920
009e7668	bl 0x00c342a0
009e766c	adrp x0,0x2bd000
009e7670	adrp x2,0x2d3000
009e7674	add x0,x0,#0x74c
009e7678	add x2,x2,#0x849
009e767c	mov w1,#0x984
009e7680	bl 0x00c342b0
009e7684	mov w2,#0x103
009e7688	mov w1,#0x50
009e768c	movk w2,#0xc, LSL #16
009e7690	b 0x009e76c0
009e7694	bl 0x00c342a0
009e7698	adrp x0,0x2bd000
009e769c	adrp x2,0x2d3000
009e76a0	add x0,x0,#0x74c
009e76a4	add x2,x2,#0x849
009e76a8	mov w1,#0x989
009e76ac	bl 0x00c342b0
009e76b0	mov w8,#0x103
009e76b4	movk w8,#0xc, LSL #16
009e76b8	sub w2,w8,#0x3
009e76bc	mov w1,#0x50
009e76c0	mov x0,x20
009e76c4	mov x3,xzr
009e76c8	bl 0x00c34410
009e76cc	mov w26,wzr
009e76d0	b 0x009e7ef4
009e76d4	mov w8,#0x102
009e76d8	tst x27,x8
009e76dc	b.eq 0x009e7958
009e76e0	ldr x8,[x20, #0x898]
009e76e4	ldr w9,[x8, #0x18]
009e76e8	cbz w9,0x009e7988
009e76ec	mov x0,x20
009e76f0	bl 0x00c365b0
009e76f4	mov x23,x0
009e76f8	mov x22,x0
009e76fc	cbnz x0,0x009e7994
009e7700	bl 0x00c342a0
009e7704	adrp x0,0x2bd000
009e7708	adrp x2,0x2d3000
009e770c	add x0,x0,#0x74c
009e7710	add x2,x2,#0x849
009e7714	mov w1,#0x99c
009e7718	b 0x009e79dc
009e771c	mov x2,xzr
009e7720	mov w3,#0x2
009e7724	mov x0,x21
009e7728	mov x1,x25
009e772c	bl 0x00c36f70
009e7730	cbz w0,0x009e7920
009e7734	mov w8,#0x102
009e7738	stp x24,x23,[sp]
009e773c	str x22,[sp, #0x10]
009e7740	mov x28,xzr
009e7744	add x24,sp,#0x58
009e7748	and x23,x27,x8
009e774c	mov w22,#0x1
009e7750	ldr x8,[x24, x28, LSL #0x3]
009e7754	cbz x8,0x009e7834
009e7758	and x8,x27,#0x20
009e775c	cmp x28,#0x2
009e7760	ccmp x8,#0x0,#0x4,eq
009e7764	cinc x1,x22,eq
009e7768	mov x0,x21
009e776c	bl 0x00c343b0
009e7770	cbz w0,0x009e7a0c
009e7774	cbz x23,0x009e77e4
009e7778	cmp x28,#0x2
009e777c	b.ne 0x009e77e4
009e7780	ldr x0,[sp, #0x58]
009e7784	bl 0x00c322f0
009e7788	add w8,w0,#0x7
009e778c	add w9,w0,#0xe
009e7790	ldr x0,[sp, #0x68]
009e7794	cmp w8,#0x0
009e7798	csel w8,w9,w8,lt
009e779c	asr w25,w8,#0x3
009e77a0	bl 0x00c322f0
009e77a4	add w8,w0,#0x7
009e77a8	add w9,w0,#0xe
009e77ac	cmp w8,#0x0
009e77b0	csel w8,w9,w8,lt
009e77b4	subs w8,w25,w8, ASR #0x3
009e77b8	b.eq 0x009e77e4
009e77bc	sxtw x25,w8
009e77c0	add x2,sp,#0x48
009e77c4	mov x0,x21
009e77c8	mov x1,x25
009e77cc	bl 0x00c36c40
009e77d0	cbz w0,0x009e7c30
009e77d4	ldr x0,[sp, #0x48]
009e77d8	mov w1,wzr
009e77dc	mov x2,x25
009e77e0	bl 0x00c301c0
009e77e4	ldr x0,[x24, x28, LSL #0x3]
009e77e8	bl 0x00c322f0
009e77ec	add w8,w0,#0x7
009e77f0	add w9,w0,#0xe
009e77f4	cmp w8,#0x0
009e77f8	csel w8,w9,w8,lt
009e77fc	sbfx x1,x8,#0x3,#0x1d
009e7800	add x2,sp,#0x48
009e7804	mov x0,x21
009e7808	bl 0x00c36c40
009e780c	cbz w0,0x009e793c
009e7810	mov x0,x21
009e7814	bl 0x00c34350
009e7818	cbz w0,0x009e793c
009e781c	ldr x0,[x24, x28, LSL #0x3]
009e7820	ldr x1,[sp, #0x48]
009e7824	bl 0x00c36980
009e7828	add x28,x28,#0x1
009e782c	cmp x28,#0x4
009e7830	b.cc 0x009e7750
009e7834	ldr x22,[sp, #0x10]
009e7838	mov w8,#0x84
009e783c	tst x27,x8
009e7840	b.eq 0x009e78b0
009e7844	orr w1,wzr,#0x3
009e7848	mov w2,#0x1
009e784c	mov x0,x21
009e7850	bl 0x00c343a0
009e7854	cbz w0,0x009e79f0
009e7858	mov w2,#0x1
009e785c	mov x0,x21
009e7860	mov x1,xzr
009e7864	bl 0x00c343a0
009e7868	cbz w0,0x009e79f0
009e786c	ldr x1,[sp, #0x8]
009e7870	mov w2,#0x1
009e7874	mov x0,x21
009e7878	bl 0x00c343a0
009e787c	cbz w0,0x009e79f0
009e7880	ldur x1,[x29, #-0x58]
009e7884	ldr x2,[sp]
009e7888	mov w3,#0x1
009e788c	mov x0,x21
009e7890	bl 0x00c36f70
009e7894	cbz w0,0x009e79f0
009e7898	ldur x0,[x29, #-0x58]
009e789c	adrp x1,0x2bd000
009e78a0	add x1,x1,#0x74c
009e78a4	mov w2,#0xa5c
009e78a8	bl 0x00c32310
009e78ac	stur xzr,[x29, #-0x58]
009e78b0	cbz x22,0x009e7fac
009e78b4	ldr x8,[x20, #0x388]
009e78b8	ldr x23,[x8, #0x8]
009e78bc	str xzr,[sp, #0x18]
009e78c0	cbz x23,0x009e7bdc
009e78c4	ldr x0,[x20, #0x9a8]
009e78c8	add x2,sp,#0x38
009e78cc	mov x1,x22
009e78d0	bl 0x00c36750
009e78d4	cbz w0,0x009e7bdc
009e78d8	add x1,sp,#0x48
009e78dc	mov x0,x21
009e78e0	bl 0x00c36c60
009e78e4	cbz w0,0x009e7d2c
009e78e8	ldr x8,[x20, #0x8]
009e78ec	ldr x8,[x8, #0xc0]
009e78f0	ldrb w8,[x8, #0x60]
009e78f4	tbz w8,#0x1,0x009e790c
009e78f8	ldrh w1,[x22, #0x8]
009e78fc	mov w2,#0x2
009e7900	mov x0,x21
009e7904	bl 0x00c343a0
009e7908	cbz w0,0x009e7ec0
009e790c	ldr x0,[sp, #0x38]
009e7910	cbz x0,0x009e7d74
009e7914	bl 0x00c36230
009e7918	mov x2,x0
009e791c	b 0x009e7d78
009e7920	bl 0x00c342a0
009e7924	adrp x0,0x2bd000
009e7928	adrp x2,0x2d3000
009e792c	add x0,x0,#0x74c
009e7930	add x2,x2,#0x849
009e7934	mov w1,#0xa1e
009e7938	b 0x009e7ed8
009e793c	bl 0x00c342a0
009e7940	adrp x0,0x2bd000
009e7944	adrp x2,0x2d3000
009e7948	add x0,x0,#0x74c
009e794c	add x2,x2,#0x849
009e7950	mov w1,#0xa47
009e7954	b 0x009e7ed8
009e7958	mov w8,#0x84
009e795c	tst x27,x8
009e7960	b.eq 0x009e7a64
009e7964	ldr x8,[x20, #0x2e8]
009e7968	cbz x8,0x009e7b44
009e796c	bl 0x00c342a0
009e7970	adrp x0,0x2bd000
009e7974	adrp x2,0x2d3000
009e7978	add x0,x0,#0x74c
009e797c	add x2,x2,#0x849
009e7980	mov w1,#0x9d2
009e7984	b 0x009e7680
009e7988	ldr x23,[x8, #0x8]
009e798c	cbz x23,0x009e7b98
009e7990	mov x22,xzr
009e7994	mov x0,x23
009e7998	bl 0x00c324c0
009e799c	mov w1,#0x7
009e79a0	mov w2,w0
009e79a4	movk w1,#0x4, LSL #16
009e79a8	mov x0,x20
009e79ac	mov w3,wzr
009e79b0	mov x4,x23
009e79b4	bl 0x00c34a30
009e79b8	cbz w0,0x009e7a28
009e79bc	ldr x8,[x20, #0x2e8]
009e79c0	cbz x8,0x009e7a90
009e79c4	bl 0x00c342a0
009e79c8	adrp x0,0x2bd000
009e79cc	adrp x2,0x2d3000
009e79d0	add x0,x0,#0x74c
009e79d4	add x2,x2,#0x849
009e79d8	mov w1,#0x9b7
009e79dc	bl 0x00c342b0
009e79e0	mov w2,#0x103
009e79e4	mov w1,#0x50
009e79e8	movk w2,#0xc, LSL #16
009e79ec	b 0x009e7a4c
009e79f0	bl 0x00c342a0
009e79f4	adrp x0,0x2bd000
009e79f8	adrp x2,0x2d3000
009e79fc	add x0,x0,#0x74c
009e7a00	add x2,x2,#0x849
009e7a04	mov w1,#0xa59
009e7a08	b 0x009e7ed8
009e7a0c	bl 0x00c342a0
009e7a10	adrp x0,0x2bd000
009e7a14	adrp x2,0x2d3000
009e7a18	add x0,x0,#0x74c
009e7a1c	add x2,x2,#0x849
009e7a20	mov w1,#0xa30
009e7a24	b 0x009e7ed8
009e7a28	bl 0x00c342a0
009e7a2c	adrp x0,0x2bd000
009e7a30	adrp x2,0x2d3000
009e7a34	add x0,x0,#0x74c
009e7a38	add x2,x2,#0x849
009e7a3c	mov w1,#0x9b3
009e7a40	bl 0x00c342b0
009e7a44	mov w1,#0x28
009e7a48	mov w2,#0x18a
009e7a4c	mov x0,x20
009e7a50	mov x3,xzr
009e7a54	bl 0x00c34410
009e7a58	mov w26,wzr
009e7a5c	mov w20,wzr
009e7a60	b 0x009e7efc
009e7a64	tbnz w27,#0x5,0x009e7bf8
009e7a68	bl 0x00c342a0
009e7a6c	adrp x0,0x2bd000
009e7a70	adrp x2,0x2d3000
009e7a74	add x0,x0,#0x74c
009e7a78	add x2,x2,#0x849
009e7a7c	mov w1,#0xa06
009e7a80	bl 0x00c342b0
009e7a84	mov w1,#0x50
009e7a88	mov w2,#0xfa
009e7a8c	b 0x009e76c0
009e7a90	mov x0,x20
009e7a94	mov x1,x23
009e7a98	bl 0x00c349d0
009e7a9c	str x0,[x20, #0x2e8]
009e7aa0	cbz x0,0x009e7cb8
009e7aa4	mov x0,x22
009e7aa8	bl 0x00c32450
009e7aac	ldr x0,[x20, #0x2e8]
009e7ab0	adrp x1,0x2a3000
009e7ab4	add x1,x1,#0x8e7
009e7ab8	add x2,sp,#0x58
009e7abc	bl 0x00c32490
009e7ac0	cbz w0,0x009e7c74
009e7ac4	ldr x0,[x20, #0x2e8]
009e7ac8	add x22,sp,#0x58
009e7acc	adrp x1,0x2d9000
009e7ad0	add x2,x22,#0x8
009e7ad4	add x1,x1,#0x2e5
009e7ad8	bl 0x00c32490
009e7adc	cbz w0,0x009e7c74
009e7ae0	ldr x0,[x20, #0x2e8]
009e7ae4	adrp x1,0x2ad000
009e7ae8	add x2,x22,#0x10
009e7aec	add x1,x1,#0x463
009e7af0	bl 0x00c32490
009e7af4	cbz w0,0x009e7c74
009e7af8	mov w23,wzr
009e7afc	mov x24,xzr
009e7b00	mov w26,#0x1
009e7b04	b 0x009e7608
009e7b08	bl 0x00c342a0
009e7b0c	adrp x0,0x2bd000
009e7b10	adrp x2,0x2d3000
009e7b14	add x0,x0,#0x74c
009e7b18	add x2,x2,#0x849
009e7b1c	mov w1,#0xa0e
009e7b20	bl 0x00c342b0
009e7b24	mov w2,#0x103
009e7b28	mov w1,#0x32
009e7b2c	movk w2,#0xc, LSL #16
009e7b30	mov x0,x20
009e7b34	mov x3,xzr
009e7b38	bl 0x00c34410
009e7b3c	mov w20,wzr
009e7b40	b 0x009e7efc
009e7b44	orr w1,wzr,#0xfffffffe
009e7b48	mov x0,x20
009e7b4c	bl 0x00c34b50
009e7b50	ands w23,w0,#0xffff
009e7b54	b.eq 0x009e7cd4
009e7b58	ldr x8,[x20, #0x918]
009e7b5c	mov x0,x20
009e7b60	mov w1,w23
009e7b64	str w23,[x8, #0x308]
009e7b68	bl 0x00c349e0
009e7b6c	str x0,[x20, #0x2e8]
009e7b70	cbz x0,0x009e7d24
009e7b74	sub x1,x29,#0x58
009e7b78	bl 0x00c36f40
009e7b7c	cbz x0,0x009e7d48
009e7b80	mov x24,x0
009e7b84	mov w26,wzr
009e7b88	movi v0.2D,#0x0
009e7b8c	stur q0,[sp, #0x68]
009e7b90	stur q0,[sp, #0x58]
009e7b94	b 0x009e7608
009e7b98	ldr x8,[x8, #0x10]
009e7b9c	cbz x8,0x009e7cfc
009e7ba0	mov w2,#0x400
009e7ba4	mov x0,x20
009e7ba8	mov w1,wzr
009e7bac	blr x8
009e7bb0	bl 0x00c34950
009e7bb4	mov x23,x0
009e7bb8	mov x22,x0
009e7bbc	cbnz x0,0x009e7994
009e7bc0	bl 0x00c342a0
009e7bc4	adrp x0,0x2bd000
009e7bc8	adrp x2,0x2d3000
009e7bcc	add x0,x0,#0x74c
009e7bd0	add x2,x2,#0x849
009e7bd4	mov w1,#0x9a7
009e7bd8	b 0x009e79dc
009e7bdc	bl 0x00c342a0
009e7be0	adrp x0,0x2bd000
009e7be4	adrp x2,0x2d3000
009e7be8	add x0,x0,#0x74c
009e7bec	add x2,x2,#0x849
009e7bf0	mov w1,#0xa69
009e7bf4	b 0x009e7ed8
009e7bf8	ldr x8,[x20, #0xbf8]
009e7bfc	cbz x8,0x009e7c4c
009e7c00	ldr x9,[x20, #0xc00]
009e7c04	cbz x9,0x009e7c4c
009e7c08	ldr x10,[x20, #0xc08]
009e7c0c	cbz x10,0x009e7c4c
009e7c10	ldr x11,[x20, #0xc10]
009e7c14	cbz x11,0x009e7c4c
009e7c18	mov w26,wzr
009e7c1c	mov w23,wzr
009e7c20	mov x24,xzr
009e7c24	stp x8,x9,[sp, #0x58]
009e7c28	stp x10,x11,[sp, #0x68]
009e7c2c	b 0x009e7608
009e7c30	bl 0x00c342a0
009e7c34	adrp x0,0x2bd000
009e7c38	adrp x2,0x2d3000
009e7c3c	add x0,x0,#0x74c
009e7c40	add x2,x2,#0x849
009e7c44	mov w1,#0xa3e
009e7c48	b 0x009e7ed8
009e7c4c	bl 0x00c342a0
009e7c50	adrp x0,0x2bd000
009e7c54	adrp x2,0x2d3000
009e7c58	add x0,x0,#0x74c
009e7c5c	add x2,x2,#0x849
009e7c60	mov w1,#0x9fc
009e7c64	bl 0x00c342b0
009e7c68	mov w1,#0x50
009e7c6c	mov w2,#0x166
009e7c70	b 0x009e76c0
009e7c74	bl 0x00c342a0
009e7c78	adrp x0,0x2bd000
009e7c7c	adrp x2,0x2d3000
009e7c80	add x0,x0,#0x74c
009e7c84	add x2,x2,#0x849
009e7c88	mov w1,#0x9cc
009e7c8c	bl 0x00c342b0
009e7c90	mov w2,#0x103
009e7c94	mov w1,#0x50
009e7c98	movk w2,#0xc, LSL #16
009e7c9c	mov x0,x20
009e7ca0	mov x3,xzr
009e7ca4	bl 0x00c34410
009e7ca8	mov w20,wzr
009e7cac	mov x22,xzr
009e7cb0	mov w26,#0x1
009e7cb4	b 0x009e7efc
009e7cb8	bl 0x00c342a0
009e7cbc	adrp x0,0x2bd000
009e7cc0	adrp x2,0x2d3000
009e7cc4	add x0,x0,#0x74c
009e7cc8	add x2,x2,#0x849
009e7ccc	mov w1,#0x9bd
009e7cd0	b 0x009e79dc
009e7cd4	bl 0x00c342a0
009e7cd8	adrp x0,0x2bd000
009e7cdc	adrp x2,0x2d3000
009e7ce0	add x0,x0,#0x74c
009e7ce4	add x2,x2,#0x849
009e7ce8	mov w1,#0x9da
009e7cec	bl 0x00c342b0
009e7cf0	mov w1,#0x28
009e7cf4	mov w2,#0x13b
009e7cf8	b 0x009e76c0
009e7cfc	bl 0x00c342a0
009e7d00	adrp x0,0x2bd000
009e7d04	adrp x2,0x2d3000
009e7d08	add x0,x0,#0x74c
009e7d0c	add x2,x2,#0x849
009e7d10	mov w1,#0x9ae
009e7d14	bl 0x00c342b0
009e7d18	mov w1,#0x50
009e7d1c	mov w2,#0xab
009e7d20	b 0x009e76c0
009e7d24	mov w26,wzr
009e7d28	b 0x009e7ef4
009e7d2c	bl 0x00c342a0
009e7d30	adrp x0,0x2bd000
009e7d34	adrp x2,0x2d3000
009e7d38	add x0,x0,#0x74c
009e7d3c	add x2,x2,#0x849
009e7d40	mov w1,#0xa6e
009e7d44	b 0x009e7ed8
009e7d48	bl 0x00c342a0
009e7d4c	adrp x0,0x2bd000
009e7d50	adrp x2,0x2d3000
009e7d54	add x0,x0,#0x74c
009e7d58	add x2,x2,#0x849
009e7d5c	mov w1,#0x9ea
009e7d60	bl 0x00c342b0
009e7d64	mov w8,#0x6
009e7d68	movk w8,#0x8, LSL #16
009e7d6c	add w2,w8,#0xa
009e7d70	b 0x009e76bc
009e7d74	mov x2,xzr
009e7d78	ldr x8,[x20, #0x9a8]
009e7d7c	add x1,sp,#0x50
009e7d80	mov x0,x19
009e7d84	mov x5,x23
009e7d88	ldr x3,[x8]
009e7d8c	ldr x4,[x8, #0x440]
009e7d90	mov x6,xzr
009e7d94	bl 0x00c361d0
009e7d98	cmp w0,#0x0
009e7d9c	b.le 0x009e7ea4
009e7da0	ldr w8,[x22, #0x14]
009e7da4	cmp w8,#0x390
009e7da8	b.ne 0x009e7dd4
009e7dac	ldr x0,[sp, #0x50]
009e7db0	orr w1,wzr,#0x6
009e7db4	bl 0x00c37100
009e7db8	cmp w0,#0x1
009e7dbc	b.lt 0x009e7f68
009e7dc0	ldr x0,[sp, #0x50]
009e7dc4	mov w1,#0xffffffff
009e7dc8	bl 0x00c37110
009e7dcc	cmp w0,#0x0
009e7dd0	b.le 0x009e7f68
009e7dd4	ldr x8,[x20, #0x88]
009e7dd8	ldp x9,x3,[sp, #0x40]
009e7ddc	add x1,sp,#0x20
009e7de0	mov x0,x20
009e7de4	ldr x8,[x8, #0x8]
009e7de8	add x2,x8,x9
009e7dec	bl 0x00c37160
009e7df0	cbz x0,0x009e7ef4
009e7df4	ldr x3,[sp, #0x20]
009e7df8	mov x22,x0
009e7dfc	add x2,sp,#0x18
009e7e00	mov x0,x19
009e7e04	mov x1,xzr
009e7e08	mov x4,x22
009e7e0c	bl 0x00c36fb0
009e7e10	cmp w0,#0x1
009e7e14	b.lt 0x009e7e74
009e7e18	ldr x1,[sp, #0x18]
009e7e1c	add x2,sp,#0x30
009e7e20	mov w3,#0x2
009e7e24	mov x0,x21
009e7e28	bl 0x00c37350
009e7e2c	cbz w0,0x009e7e74
009e7e30	ldr x1,[sp, #0x30]
009e7e34	ldr x3,[sp, #0x20]
009e7e38	add x2,sp,#0x18
009e7e3c	mov x0,x19
009e7e40	mov x4,x22
009e7e44	bl 0x00c36fb0
009e7e48	cmp w0,#0x1
009e7e4c	b.lt 0x009e7e74
009e7e50	ldr x1,[sp, #0x18]
009e7e54	add x2,sp,#0x28
009e7e58	mov w3,#0x2
009e7e5c	mov x0,x21
009e7e60	bl 0x00c36f60
009e7e64	cbz w0,0x009e7e74
009e7e68	ldp x9,x8,[sp, #0x28]
009e7e6c	cmp x8,x9
009e7e70	b.eq 0x009e7f94
009e7e74	ldr x0,[sp, #0x20]
009e7e78	adrp x21,0x2bd000
009e7e7c	add x21,x21,#0x74c
009e7e80	mov w2,#0xa92
009e7e84	mov x1,x21
009e7e88	bl 0x00c32310
009e7e8c	bl 0x00c342a0
009e7e90	adrp x2,0x2d3000
009e7e94	add x2,x2,#0x849
009e7e98	mov w1,#0xa93
009e7e9c	mov x0,x21
009e7ea0	b 0x009e7ed8
009e7ea4	bl 0x00c342a0
009e7ea8	adrp x0,0x2bd000
009e7eac	adrp x2,0x2d3000
009e7eb0	add x0,x0,#0x74c
009e7eb4	add x2,x2,#0x849
009e7eb8	mov w1,#0xa7b
009e7ebc	b 0x009e7ed8
009e7ec0	bl 0x00c342a0
009e7ec4	adrp x0,0x2bd000
009e7ec8	adrp x2,0x2d3000
009e7ecc	add x0,x0,#0x74c
009e7ed0	add x2,x2,#0x849
009e7ed4	mov w1,#0xa73
009e7ed8	bl 0x00c342b0
009e7edc	mov w2,#0x103
009e7ee0	mov w1,#0x50
009e7ee4	movk w2,#0xc, LSL #16
009e7ee8	mov x0,x20
009e7eec	mov x3,xzr
009e7ef0	bl 0x00c34410
009e7ef4	mov w20,wzr
009e7ef8	mov x22,xzr
009e7efc	mov x0,x22
009e7f00	bl 0x00c32450
009e7f04	ldur x0,[x29, #-0x58]
009e7f08	adrp x1,0x2bd000
009e7f0c	add x1,x1,#0x74c
009e7f10	mov w2,#0xa9c
009e7f14	bl 0x00c32310
009e7f18	mov x0,x19
009e7f1c	bl 0x00c31f90
009e7f20	cbz w26,0x009e7f44
009e7f24	ldr x0,[sp, #0x58]
009e7f28	bl 0x00c36290
009e7f2c	ldr x0,[sp, #0x60]
009e7f30	bl 0x00c36290
009e7f34	ldr x0,[sp, #0x68]
009e7f38	bl 0x00c36290
009e7f3c	ldr x0,[sp, #0x70]
009e7f40	bl 0x00c36290
009e7f44	mov w0,w20
009e7f48	ldp x29,x30,[sp, #0xd0]
009e7f4c	ldp x20,x19,[sp, #0xc0]
009e7f50	ldp x22,x21,[sp, #0xb0]
009e7f54	ldp x24,x23,[sp, #0xa0]
009e7f58	ldp x26,x25,[sp, #0x90]
009e7f5c	ldp x28,x27,[sp, #0x80]
009e7f60	add sp,sp,#0xe0
009e7f64	ret
009e7f68	bl 0x00c342a0
009e7f6c	adrp x0,0x2bd000
009e7f70	adrp x2,0x2d3000
009e7f74	add x0,x0,#0x74c
009e7f78	add x2,x2,#0x849
009e7f7c	mov w1,#0xa81
009e7f80	bl 0x00c342b0
009e7f84	mov w2,#0x6
009e7f88	mov w1,#0x50
009e7f8c	movk w2,#0x8, LSL #16
009e7f90	b 0x009e7ee8
009e7f94	ldr x0,[sp, #0x20]
009e7f98	adrp x1,0x2bd000
009e7f9c	add x1,x1,#0x74c
009e7fa0	mov w2,#0xa96
009e7fa4	bl 0x00c32310
009e7fa8	mov x22,xzr
009e7fac	mov w20,#0x1
009e7fb0	b 0x009e7efc
