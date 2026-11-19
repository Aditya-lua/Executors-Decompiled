; PKCS5_pbe2_set_iv_ex @ 00a6a5f4
00a6a5f4	sub sp,sp,#0x70
00a6a5f8	str x27,[sp, #0x10]
00a6a5fc	stp x26,x25,[sp, #0x20]
00a6a600	stp x24,x23,[sp, #0x30]
00a6a604	stp x22,x21,[sp, #0x40]
00a6a608	stp x20,x19,[sp, #0x50]
00a6a60c	stp x29,x30,[sp, #0x60]
00a6a610	add x29,sp,#0x60
00a6a614	mov x20,x6
00a6a618	mov x26,x4
00a6a61c	mov w21,w3
00a6a620	mov x22,x2
00a6a624	mov w23,w1
00a6a628	mov x24,x0
00a6a62c	str w5,[sp, #0x1c]
00a6a630	bl 0x00c3cf00
00a6a634	cbz w0,0x00a6a69c
00a6a638	mov w25,w0
00a6a63c	adrp x0,0xc5e000
00a6a640	add x0,x0,#0x9f0
00a6a644	bl 0x00c372e0
00a6a648	mov x19,x0
00a6a64c	cbz x0,0x00a6a82c
00a6a650	ldr x27,[x19, #0x8]
00a6a654	mov w0,w25
00a6a658	bl 0x00c37740
00a6a65c	str x0,[x27]
00a6a660	bl 0x00c37a40
00a6a664	str x0,[x27, #0x8]
00a6a668	cbz x0,0x00a6a82c
00a6a66c	mov x0,x24
00a6a670	bl 0x00c34bc0
00a6a674	cmp w0,#0x1
00a6a678	b.lt 0x00a6a6f0
00a6a67c	sxtw x2,w0
00a6a680	cbz x26,0x00a6a6d8
00a6a684	mov x0,sp
00a6a688	mov x1,x26
00a6a68c	bl 0x00c2ffd0
00a6a690	bl 0x00c34b90
00a6a694	cbnz x0,0x00a6a6f8
00a6a698	b 0x00a6a82c
00a6a69c	bl 0x00c342a0
00a6a6a0	adrp x0,0x2b0000
00a6a6a4	adrp x2,0x2b4000
00a6a6a8	add x0,x0,#0x34
00a6a6ac	add x2,x2,#0x2df
00a6a6b0	mov w1,#0x37
00a6a6b4	bl 0x00c342b0
00a6a6b8	mov w0,#0xd
00a6a6bc	mov w1,#0x6c
00a6a6c0	mov x2,xzr
00a6a6c4	bl 0x00c342c0
00a6a6c8	mov x20,xzr
00a6a6cc	mov x26,xzr
00a6a6d0	mov x19,xzr
00a6a6d4	b 0x00a6a864
00a6a6d8	mov x1,sp
00a6a6dc	mov x0,x20
00a6a6e0	mov w3,wzr
00a6a6e4	bl 0x00c347b0
00a6a6e8	cmp w0,#0x1
00a6a6ec	b.lt 0x00a6a8ac
00a6a6f0	bl 0x00c34b90
00a6a6f4	cbz x0,0x00a6a82c
00a6a6f8	mov x4,sp
00a6a6fc	mov x1,x24
00a6a700	mov x2,xzr
00a6a704	mov x3,xzr
00a6a708	mov w5,wzr
00a6a70c	mov x26,x0
00a6a710	bl 0x00c34be0
00a6a714	cbz w0,0x00a6a7b0
00a6a718	ldr x1,[x27, #0x8]
00a6a71c	mov x0,x26
00a6a720	bl 0x00c3cf20
00a6a724	cmp w0,#0x0
00a6a728	b.le 0x00a6a784
00a6a72c	bl 0x00c35250
00a6a730	ldr w8,[sp, #0x1c]
00a6a734	cmn w8,#0x1
00a6a738	b.ne 0x00a6a760
00a6a73c	orr w1,wzr,#0x7
00a6a740	add x3,sp,#0x1c
00a6a744	mov x0,x26
00a6a748	mov w2,wzr
00a6a74c	bl 0x00c361b0
00a6a750	cmp w0,#0x0
00a6a754	b.gt 0x00a6a760
00a6a758	mov w8,#0x31f
00a6a75c	str w8,[sp, #0x1c]
00a6a760	bl 0x00c35240
00a6a764	mov x0,x26
00a6a768	bl 0x00c342d0
00a6a76c	cmp w25,#0x25
00a6a770	b.ne 0x00a6a7b8
00a6a774	mov x0,x24
00a6a778	bl 0x00c34bd0
00a6a77c	mov w24,w0
00a6a780	b 0x00a6a7bc
00a6a784	bl 0x00c342a0
00a6a788	adrp x0,0x2b0000
00a6a78c	adrp x2,0x2b4000
00a6a790	add x0,x0,#0x34
00a6a794	add x2,x2,#0x2df
00a6a798	mov w1,#0x55
00a6a79c	bl 0x00c342b0
00a6a7a0	mov w0,#0xd
00a6a7a4	mov w1,#0x72
00a6a7a8	mov x2,xzr
00a6a7ac	bl 0x00c342c0
00a6a7b0	mov x20,xzr
00a6a7b4	b 0x00a6a864
00a6a7b8	mov w24,#0xffffffff
00a6a7bc	ldr x0,[x19]
00a6a7c0	bl 0x00c38240
00a6a7c4	ldr w3,[sp, #0x1c]
00a6a7c8	mov w0,w23
00a6a7cc	mov x1,x22
00a6a7d0	mov w2,w21
00a6a7d4	mov w4,w24
00a6a7d8	mov x5,x20
00a6a7dc	bl 0x00a6a8b4
00a6a7e0	str x0,[x19]
00a6a7e4	cbz x0,0x00a6a82c
00a6a7e8	bl 0x00c38250
00a6a7ec	mov x20,x0
00a6a7f0	cbz x0,0x00a6a830
00a6a7f4	mov w0,#0xa1
00a6a7f8	bl 0x00c37740
00a6a7fc	mov x2,x20
00a6a800	str x0,[x2], #0x8
00a6a804	adrp x0,0xc5e000
00a6a808	add x0,x0,#0x9f0
00a6a80c	mov x1,x19
00a6a810	bl 0x00c37a50
00a6a814	cbz x0,0x00a6a830
00a6a818	adrp x1,0xc5e000
00a6a81c	add x1,x1,#0x9f0
00a6a820	mov x0,x19
00a6a824	bl 0x00c36160
00a6a828	b 0x00a6a888
00a6a82c	mov x20,xzr
00a6a830	bl 0x00c342a0
00a6a834	adrp x0,0x2b0000
00a6a838	adrp x2,0x2b4000
00a6a83c	add x0,x0,#0x34
00a6a840	add x2,x2,#0x2df
00a6a844	mov w1,#0x89
00a6a848	bl 0x00c342b0
00a6a84c	mov w1,#0x100
00a6a850	mov w0,#0xd
00a6a854	movk w1,#0xc, LSL #16
00a6a858	mov x2,xzr
00a6a85c	bl 0x00c342c0
00a6a860	mov x26,xzr
00a6a864	mov x0,x26
00a6a868	bl 0x00c342d0
00a6a86c	adrp x1,0xc5e000
00a6a870	add x1,x1,#0x9f0
00a6a874	mov x0,x19
00a6a878	bl 0x00c36160
00a6a87c	mov x0,x20
00a6a880	bl 0x00c38240
00a6a884	mov x20,xzr
00a6a888	mov x0,x20
00a6a88c	ldp x29,x30,[sp, #0x60]
00a6a890	ldp x20,x19,[sp, #0x50]
00a6a894	ldp x22,x21,[sp, #0x40]
00a6a898	ldp x24,x23,[sp, #0x30]
00a6a89c	ldp x26,x25,[sp, #0x20]
00a6a8a0	ldr x27,[sp, #0x10]
00a6a8a4	add sp,sp,#0x70
00a6a8a8	ret
00a6a8ac	mov x20,xzr
00a6a8b0	b 0x00a6a860
