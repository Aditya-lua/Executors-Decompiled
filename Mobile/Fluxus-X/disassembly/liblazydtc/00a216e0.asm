; BN_mod_exp2_mont @ 00a216e0
00a216e0	stp x28,x27,[sp, #-0x60]!
00a216e4	stp x26,x25,[sp, #0x10]
00a216e8	stp x24,x23,[sp, #0x20]
00a216ec	stp x22,x21,[sp, #0x30]
00a216f0	stp x20,x19,[sp, #0x40]
00a216f4	stp x29,x30,[sp, #0x50]
00a216f8	add x29,sp,#0x50
00a216fc	sub sp,sp,#0x250
00a21700	mov x23,x0
00a21704	mov x0,x5
00a21708	mov x21,x7
00a2170c	mov x19,x6
00a21710	mov x25,x5
00a21714	mov x28,x4
00a21718	mov x26,x3
00a2171c	mov x24,x2
00a21720	mov x27,x1
00a21724	bl 0x00c38d10
00a21728	cbz w0,0x00a217c0
00a2172c	mov x0,x24
00a21730	bl 0x00c322f0
00a21734	mov w20,w0
00a21738	mov x0,x28
00a2173c	bl 0x00c322f0
00a21740	orr w8,w0,w20
00a21744	cbz w8,0x00a217f4
00a21748	cmp w20,w0
00a2174c	mov w22,w0
00a21750	csel w8,w20,w0,gt
00a21754	mov x0,x19
00a21758	str x28,[sp, #0x20]
00a2175c	str x21,[sp, #0x40]
00a21760	str w8,[sp, #0x2c]
00a21764	bl 0x00c38a90
00a21768	mov x0,x19
00a2176c	bl 0x00c38a40
00a21770	str x0,[sp, #0x30]
00a21774	mov x0,x19
00a21778	bl 0x00c38a40
00a2177c	str x0,[sp, #0x18]
00a21780	mov x0,x19
00a21784	bl 0x00c38a40
00a21788	mov x21,x0
00a2178c	str x0,[sp, #0x148]
00a21790	mov x0,x19
00a21794	bl 0x00c38a40
00a21798	str x0,[sp, #0x48]
00a2179c	cbz x0,0x00a21808
00a217a0	ldr x8,[sp, #0x40]
00a217a4	mov x28,x0
00a217a8	mov x9,x8
00a217ac	cbz x8,0x00a2181c
00a217b0	cmp w20,#0x29f
00a217b4	b.le 0x00a2184c
00a217b8	orr w20,wzr,#0x6
00a217bc	b 0x00a21884
00a217c0	bl 0x00c342a0
00a217c4	adrp x0,0x2d3000
00a217c8	adrp x2,0x2b7000
00a217cc	add x0,x0,#0x9a5
00a217d0	add x2,x2,#0x9af
00a217d4	mov w1,#0x24
00a217d8	bl 0x00c342b0
00a217dc	orr w0,wzr,#0x3
00a217e0	mov w1,#0x66
00a217e4	mov x2,xzr
00a217e8	bl 0x00c342c0
00a217ec	mov w21,wzr
00a217f0	b 0x00a21d2c
00a217f4	mov w1,#0x1
00a217f8	mov x0,x23
00a217fc	bl 0x00c37720
00a21800	mov w21,w0
00a21804	b 0x00a21d2c
00a21808	mov w21,wzr
00a2180c	mov x23,xzr
00a21810	ldr x8,[sp, #0x40]
00a21814	cbnz x8,0x00a21d24
00a21818	b 0x00a21d1c
00a2181c	bl 0x00c38f80
00a21820	cbz x0,0x00a2186c
00a21824	mov x1,x25
00a21828	mov x2,x19
00a2182c	str x23,[sp, #0x38]
00a21830	mov x23,x0
00a21834	bl 0x00c38f90
00a21838	cbz w0,0x00a21a14
00a2183c	mov x9,x23
00a21840	ldr x23,[sp, #0x38]
00a21844	cmp w20,#0x29f
00a21848	b.gt 0x00a217b8
00a2184c	cmp w20,#0xef
00a21850	b.le 0x00a2185c
00a21854	mov w20,#0x5
00a21858	b 0x00a21884
00a2185c	cmp w20,#0x4f
00a21860	b.le 0x00a21878
00a21864	mov w20,#0x4
00a21868	b 0x00a21884
00a2186c	mov x23,xzr
00a21870	mov w21,wzr
00a21874	b 0x00a21d1c
00a21878	cmp w20,#0x17
00a2187c	orr w8,wzr,#0x3
00a21880	csinc w20,w8,wzr,gt
00a21884	cmp w22,#0x29f
00a21888	str x9,[sp, #0x38]
00a2188c	b.le 0x00a218a0
00a21890	orr w22,wzr,#0x6
00a21894	ldr w8,[x27, #0x10]
00a21898	cbnz w8,0x00a218f4
00a2189c	b 0x00a218e4
00a218a0	cmp w22,#0xef
00a218a4	b.le 0x00a218b8
00a218a8	mov w22,#0x5
00a218ac	ldr w8,[x27, #0x10]
00a218b0	cbnz w8,0x00a218f4
00a218b4	b 0x00a218e4
00a218b8	cmp w22,#0x4f
00a218bc	b.le 0x00a218d0
00a218c0	mov w22,#0x4
00a218c4	ldr w8,[x27, #0x10]
00a218c8	cbnz w8,0x00a218f4
00a218cc	b 0x00a218e4
00a218d0	cmp w22,#0x17
00a218d4	orr w8,wzr,#0x3
00a218d8	csinc w22,w8,wzr,gt
00a218dc	ldr w8,[x27, #0x10]
00a218e0	cbnz w8,0x00a218f4
00a218e4	mov x0,x27
00a218e8	mov x1,x25
00a218ec	bl 0x00c369c0
00a218f0	tbnz w0,#0x1f,0x00a21914
00a218f4	mov x0,xzr
00a218f8	mov x1,x21
00a218fc	mov x2,x27
00a21900	mov x3,x25
00a21904	mov x4,x19
00a21908	bl 0x00c38ab0
00a2190c	mov x27,x21
00a21910	cbz w0,0x00a21d0c
00a21914	mov x0,x27
00a21918	bl 0x00c369b0
00a2191c	cbz w0,0x00a2193c
00a21920	mov x0,x23
00a21924	bl 0x00c38e00
00a21928	ldr x23,[sp, #0x38]
00a2192c	mov w21,#0x1
00a21930	ldr x8,[sp, #0x40]
00a21934	cbnz x8,0x00a21d24
00a21938	b 0x00a21d1c
00a2193c	ldr x2,[sp, #0x38]
00a21940	mov x0,x21
00a21944	mov x1,x27
00a21948	mov x3,x19
00a2194c	bl 0x00c38dd0
00a21950	cbz w0,0x00a21d0c
00a21954	cmp w20,#0x2
00a21958	str w22,[sp, #0x14]
00a2195c	b.cc 0x00a219d0
00a21960	ldp x0,x3,[sp, #0x30]
00a21964	mov x1,x21
00a21968	mov x2,x21
00a2196c	mov x4,x19
00a21970	bl 0x00c38d60
00a21974	cbz w0,0x00a21d0c
00a21978	sub w8,w20,#0x1
00a2197c	mov w9,#0x1
00a21980	lsl w8,w9,w8
00a21984	cmp w8,#0x2
00a21988	b.lt 0x00a219d0
00a2198c	mov x21,xzr
00a21990	sxtw x27,w8
00a21994	add x22,sp,#0x148
00a21998	mov x0,x19
00a2199c	bl 0x00c38a40
00a219a0	add x8,x22,x21, LSL #0x3
00a219a4	str x0,[x8, #0x8]
00a219a8	cbz x0,0x00a21d0c
00a219ac	ldr x1,[x22, x21, LSL #0x3]
00a219b0	ldp x2,x3,[sp, #0x30]
00a219b4	mov x4,x19
00a219b8	bl 0x00c38d60
00a219bc	cbz w0,0x00a21d0c
00a219c0	add x8,x21,#0x2
00a219c4	add x21,x21,#0x1
00a219c8	cmp x8,x27
00a219cc	b.lt 0x00a21998
00a219d0	ldr w8,[x26, #0x10]
00a219d4	cbnz w8,0x00a219e8
00a219d8	mov x0,x26
00a219dc	mov x1,x25
00a219e0	bl 0x00c369c0
00a219e4	tbnz w0,#0x1f,0x00a21a1c
00a219e8	mov x0,xzr
00a219ec	mov x1,x28
00a219f0	mov x2,x26
00a219f4	mov x3,x25
00a219f8	mov x4,x19
00a219fc	bl 0x00c38ab0
00a21a00	ldr w27,[sp, #0x2c]
00a21a04	ldr w21,[sp, #0x14]
00a21a08	mov x26,x28
00a21a0c	cbnz w0,0x00a21a24
00a21a10	b 0x00a21d0c
00a21a14	mov w21,wzr
00a21a18	b 0x00a21d1c
00a21a1c	ldr w27,[sp, #0x2c]
00a21a20	ldr w21,[sp, #0x14]
00a21a24	mov x0,x26
00a21a28	bl 0x00c369b0
00a21a2c	cbnz w0,0x00a21920
00a21a30	ldr x2,[sp, #0x38]
00a21a34	mov x0,x28
00a21a38	mov x1,x26
00a21a3c	mov x3,x19
00a21a40	bl 0x00c38dd0
00a21a44	cbz w0,0x00a21d0c
00a21a48	cmp w21,#0x2
00a21a4c	b.cc 0x00a21ac4
00a21a50	ldp x0,x3,[sp, #0x30]
00a21a54	mov x1,x28
00a21a58	mov x2,x28
00a21a5c	mov x4,x19
00a21a60	bl 0x00c38d60
00a21a64	cbz w0,0x00a21d0c
00a21a68	ldr w8,[sp, #0x14]
00a21a6c	mov w9,#0x1
00a21a70	sub w8,w8,#0x1
00a21a74	lsl w8,w9,w8
00a21a78	cmp w8,#0x2
00a21a7c	b.lt 0x00a21ac4
00a21a80	mov x21,xzr
00a21a84	sxtw x25,w8
00a21a88	add x22,sp,#0x48
00a21a8c	mov x0,x19
00a21a90	bl 0x00c38a40
00a21a94	add x8,x22,x21, LSL #0x3
00a21a98	str x0,[x8, #0x8]
00a21a9c	cbz x0,0x00a21d0c
00a21aa0	ldr x1,[x22, x21, LSL #0x3]
00a21aa4	ldp x2,x3,[sp, #0x30]
00a21aa8	mov x4,x19
00a21aac	bl 0x00c38d60
00a21ab0	cbz w0,0x00a21d0c
00a21ab4	add x8,x21,#0x2
00a21ab8	add x21,x21,#0x1
00a21abc	cmp x8,x25
00a21ac0	b.lt 0x00a21a8c
00a21ac4	bl 0x00c38de0
00a21ac8	ldr x22,[sp, #0x18]
00a21acc	ldr x2,[sp, #0x38]
00a21ad0	mov x1,x0
00a21ad4	mov x3,x19
00a21ad8	mov x0,x22
00a21adc	bl 0x00c38dd0
00a21ae0	cbz w0,0x00a21d0c
00a21ae4	cmp w27,#0x1
00a21ae8	b.lt 0x00a21ce0
00a21aec	ldr w9,[sp, #0x14]
00a21af0	sub w8,w27,#0x2
00a21af4	mov w28,wzr
00a21af8	mov w26,wzr
00a21afc	sub w21,w8,w20
00a21b00	mov w20,#0x1
00a21b04	sub w25,w8,w9
00a21b08	stp wzr,wzr,[sp, #0xc]
00a21b0c	cbnz w20,0x00a21b2c
00a21b10	ldr x3,[sp, #0x38]
00a21b14	mov x0,x22
00a21b18	mov x1,x22
00a21b1c	mov x2,x22
00a21b20	mov x4,x19
00a21b24	bl 0x00c38d60
00a21b28	cbz w0,0x00a21d0c
00a21b2c	str w27,[sp, #0x30]
00a21b30	sub w27,w27,#0x1
00a21b34	cbnz w26,0x00a21bc0
00a21b38	mov x0,x24
00a21b3c	mov w1,w27
00a21b40	bl 0x00c38d00
00a21b44	cbz w0,0x00a21bbc
00a21b48	str w27,[sp, #0x2c]
00a21b4c	mov w27,w21
00a21b50	str w20,[sp, #0x14]
00a21b54	add w1,w27,#0x2
00a21b58	mov x0,x24
00a21b5c	bl 0x00c38d00
00a21b60	add w27,w27,#0x1
00a21b64	cbz w0,0x00a21b54
00a21b68	ldr w8,[sp, #0x30]
00a21b6c	mov w26,#0x1
00a21b70	sub w20,w8,#0x2
00a21b74	cmp w20,w27
00a21b78	add w8,w27,#0x1
00a21b7c	str w8,[sp, #0x10]
00a21b80	b.le 0x00a21bac
00a21b84	mov x0,x24
00a21b88	mov w1,w20
00a21b8c	bl 0x00c38d00
00a21b90	cmp w0,#0x0
00a21b94	cset w8,ne
00a21b98	sub w20,w20,#0x1
00a21b9c	bfm w8,w26,#0x1f,#0x1e
00a21ba0	cmp w20,w27
00a21ba4	mov w26,w8
00a21ba8	b.gt 0x00a21b84
00a21bac	ldr w27,[sp, #0x2c]
00a21bb0	ldr w20,[sp, #0x14]
00a21bb4	cbnz w28,0x00a21c54
00a21bb8	b 0x00a21bc4
00a21bbc	mov w26,wzr
00a21bc0	cbnz w28,0x00a21c54
00a21bc4	str w20,[sp, #0x14]
00a21bc8	ldr x20,[sp, #0x20]
00a21bcc	mov w1,w27
00a21bd0	mov x0,x20
00a21bd4	bl 0x00c38d00
00a21bd8	cbz w0,0x00a21c4c
00a21bdc	str w27,[sp, #0x2c]
00a21be0	mov w27,w25
00a21be4	add w1,w27,#0x2
00a21be8	mov x0,x20
00a21bec	bl 0x00c38d00
00a21bf0	add w27,w27,#0x1
00a21bf4	cbz w0,0x00a21be4
00a21bf8	ldr w8,[sp, #0x30]
00a21bfc	mov w28,#0x1
00a21c00	sub w20,w8,#0x2
00a21c04	cmp w20,w27
00a21c08	add w8,w27,#0x1
00a21c0c	str w8,[sp, #0xc]
00a21c10	b.le 0x00a21c44
00a21c14	ldr x22,[sp, #0x20]
00a21c18	mov x0,x22
00a21c1c	mov w1,w20
00a21c20	bl 0x00c38d00
00a21c24	cmp w0,#0x0
00a21c28	cset w8,ne
00a21c2c	sub w20,w20,#0x1
00a21c30	bfm w8,w28,#0x1f,#0x1e
00a21c34	cmp w20,w27
00a21c38	mov w28,w8
00a21c3c	b.gt 0x00a21c18
00a21c40	ldr x22,[sp, #0x18]
00a21c44	ldr w27,[sp, #0x2c]
00a21c48	b 0x00a21c50
00a21c4c	mov w28,wzr
00a21c50	ldr w20,[sp, #0x14]
00a21c54	ldr w8,[sp, #0x10]
00a21c58	cmp w27,w8
00a21c5c	b.ne 0x00a21c90
00a21c60	cbz w26,0x00a21c90
00a21c64	asr w8,w26,#0x1
00a21c68	add x9,sp,#0x148
00a21c6c	ldr x2,[x9, w8, SXTW #0x3]
00a21c70	ldr x3,[sp, #0x38]
00a21c74	mov x0,x22
00a21c78	mov x1,x22
00a21c7c	mov x4,x19
00a21c80	bl 0x00c38d60
00a21c84	mov w26,wzr
00a21c88	mov w20,wzr
00a21c8c	cbz w0,0x00a21d0c
00a21c90	ldr w8,[sp, #0xc]
00a21c94	cmp w27,w8
00a21c98	b.ne 0x00a21ccc
00a21c9c	cbz w28,0x00a21ccc
00a21ca0	asr w8,w28,#0x1
00a21ca4	add x9,sp,#0x48
00a21ca8	ldr x2,[x9, w8, SXTW #0x3]
00a21cac	ldr x3,[sp, #0x38]
00a21cb0	mov x0,x22
00a21cb4	mov x1,x22
00a21cb8	mov x4,x19
00a21cbc	bl 0x00c38d60
00a21cc0	mov w28,wzr
00a21cc4	mov w20,wzr
00a21cc8	cbz w0,0x00a21d0c
00a21ccc	ldr w8,[sp, #0x30]
00a21cd0	sub w21,w21,#0x1
00a21cd4	sub w25,w25,#0x1
00a21cd8	cmp w8,#0x1
00a21cdc	b.gt 0x00a21b0c
00a21ce0	mov x0,x23
00a21ce4	ldr x23,[sp, #0x38]
00a21ce8	mov x1,x22
00a21cec	mov x3,x19
00a21cf0	mov x2,x23
00a21cf4	bl 0x00c38fb0
00a21cf8	cmp w0,#0x0
00a21cfc	cset w21,ne
00a21d00	ldr x8,[sp, #0x40]
00a21d04	cbnz x8,0x00a21d24
00a21d08	b 0x00a21d1c
00a21d0c	ldr x23,[sp, #0x38]
00a21d10	mov w21,wzr
00a21d14	ldr x8,[sp, #0x40]
00a21d18	cbnz x8,0x00a21d24
00a21d1c	mov x0,x23
00a21d20	bl 0x00c38f70
00a21d24	mov x0,x19
00a21d28	bl 0x00c38a20
00a21d2c	mov w0,w21
00a21d30	add sp,sp,#0x250
00a21d34	ldp x29,x30,[sp, #0x50]
00a21d38	ldp x20,x19,[sp, #0x40]
00a21d3c	ldp x22,x21,[sp, #0x30]
00a21d40	ldp x24,x23,[sp, #0x20]
00a21d44	ldp x26,x25,[sp, #0x10]
00a21d48	ldp x28,x27,[sp], #0x60
00a21d4c	ret
