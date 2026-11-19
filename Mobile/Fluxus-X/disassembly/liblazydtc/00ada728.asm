; ossl_rsa_sp800_56b_check_keypair @ 00ada728
00ada728	str x23,[sp, #-0x40]!
00ada72c	stp x22,x21,[sp, #0x10]
00ada730	stp x20,x19,[sp, #0x20]
00ada734	stp x29,x30,[sp, #0x30]
00ada738	ldr x8,[x0, #0x40]
00ada73c	add x29,sp,#0x30
00ada740	cbz x8,0x00ada7b0
00ada744	ldr x8,[x0, #0x48]
00ada748	mov x19,x0
00ada74c	cbz x8,0x00ada7b0
00ada750	ldr x8,[x19, #0x30]
00ada754	cbz x8,0x00ada7b0
00ada758	ldr x8,[x19, #0x38]
00ada75c	cbz x8,0x00ada7b0
00ada760	ldr x8,[x19, #0x28]
00ada764	cbz x8,0x00ada7b0
00ada768	mov x20,x1
00ada76c	mov w0,w3
00ada770	mov w1,w2
00ada774	mov w21,w3
00ada778	bl 0x00c40090
00ada77c	cbz w0,0x00ada7dc
00ada780	cbz x20,0x00ada7f8
00ada784	ldr x1,[x19, #0x30]
00ada788	mov x0,x20
00ada78c	bl 0x00c38cc0
00ada790	cbz w0,0x00ada7f8
00ada794	bl 0x00c342a0
00ada798	adrp x0,0x2c0000
00ada79c	adrp x2,0x29e000
00ada7a0	add x0,x0,#0x537
00ada7a4	add x2,x2,#0xa28
00ada7a8	mov w1,#0x18d
00ada7ac	b 0x00ada7c8
00ada7b0	bl 0x00c342a0
00ada7b4	adrp x0,0x2c0000
00ada7b8	adrp x2,0x29e000
00ada7bc	add x0,x0,#0x537
00ada7c0	add x2,x2,#0xa28
00ada7c4	mov w1,#0x182
00ada7c8	bl 0x00c342b0
00ada7cc	mov w0,#0x4
00ada7d0	mov w1,#0xaf
00ada7d4	mov x2,xzr
00ada7d8	bl 0x00c342c0
00ada7dc	mov w19,wzr
00ada7e0	mov w0,w19
00ada7e4	ldp x29,x30,[sp, #0x30]
00ada7e8	ldp x20,x19,[sp, #0x20]
00ada7ec	ldp x22,x21,[sp, #0x10]
00ada7f0	ldr x23,[sp], #0x40
00ada7f4	ret
00ada7f8	ldr x20,[x19, #0x30]
00ada7fc	mov x0,x20
00ada800	bl 0x00c38d10
00ada804	cbz w0,0x00ada8a0
00ada808	bl 0x00c38de0
00ada80c	mov x1,x0
00ada810	mov x0,x20
00ada814	bl 0x00c38cc0
00ada818	cmp w0,#0x0
00ada81c	b.le 0x00ada8a0
00ada820	ldr x0,[x19, #0x28]
00ada824	bl 0x00c322f0
00ada828	cmp w0,w21
00ada82c	b.ne 0x00ada8c8
00ada830	ldr x0,[x19, #0x8]
00ada834	bl 0x00c38a60
00ada838	cbz x0,0x00ada7dc
00ada83c	mov x20,x0
00ada840	bl 0x00c38a90
00ada844	mov x0,x20
00ada848	bl 0x00c38a40
00ada84c	mov x22,x0
00ada850	cbz x0,0x00ada974
00ada854	ldp x1,x2,[x19, #0x40]
00ada858	mov x0,x22
00ada85c	mov x3,x20
00ada860	bl 0x00c39060
00ada864	cbz w0,0x00ada974
00ada868	ldr x0,[x19, #0x28]
00ada86c	mov x1,x22
00ada870	bl 0x00c38cc0
00ada874	cbz w0,0x00ada8f0
00ada878	bl 0x00c342a0
00ada87c	adrp x0,0x2c0000
00ada880	adrp x2,0x29e000
00ada884	add x0,x0,#0x537
00ada888	add x2,x2,#0xa28
00ada88c	mov w1,#0x1a7
00ada890	bl 0x00c342b0
00ada894	mov w0,#0x4
00ada898	mov w1,#0xaf
00ada89c	b 0x00ada96c
00ada8a0	bl 0x00c342a0
00ada8a4	adrp x0,0x2c0000
00ada8a8	adrp x2,0x29e000
00ada8ac	add x0,x0,#0x537
00ada8b0	add x2,x2,#0xa28
00ada8b4	mov w1,#0x194
00ada8b8	bl 0x00c342b0
00ada8bc	mov w0,#0x4
00ada8c0	mov w1,#0xb2
00ada8c4	b 0x00ada7d4
00ada8c8	bl 0x00c342a0
00ada8cc	adrp x0,0x2c0000
00ada8d0	adrp x2,0x29e000
00ada8d4	add x0,x0,#0x537
00ada8d8	add x2,x2,#0xa28
00ada8dc	mov w1,#0x199
00ada8e0	bl 0x00c342b0
00ada8e4	mov w0,#0x4
00ada8e8	mov w1,#0xab
00ada8ec	b 0x00ada7d4
00ada8f0	ldr x0,[x19, #0x40]
00ada8f4	ldr x1,[x19, #0x30]
00ada8f8	mov w2,w21
00ada8fc	mov x3,x20
00ada900	bl 0x00ada0b8
00ada904	cbz w0,0x00ada948
00ada908	ldr x0,[x19, #0x48]
00ada90c	ldr x1,[x19, #0x30]
00ada910	mov w2,w21
00ada914	mov x3,x20
00ada918	bl 0x00ada0b8
00ada91c	cbz w0,0x00ada948
00ada920	ldp x1,x2,[x19, #0x40]
00ada924	mov x0,x22
00ada928	bl 0x00c38880
00ada92c	cbz w0,0x00ada948
00ada930	mov x0,x22
00ada934	mov w1,wzr
00ada938	bl 0x00c37f50
00ada93c	mov x0,x22
00ada940	bl 0x00c369b0
00ada944	cbz w0,0x00ada994
00ada948	bl 0x00c342a0
00ada94c	adrp x0,0x2c0000
00ada950	adrp x2,0x29e000
00ada954	add x0,x0,#0x537
00ada958	add x2,x2,#0xa28
00ada95c	mov w1,#0x1b4
00ada960	bl 0x00c342b0
00ada964	mov w0,#0x4
00ada968	mov w1,#0xab
00ada96c	mov x2,xzr
00ada970	bl 0x00c342c0
00ada974	mov w19,wzr
00ada978	mov x0,x22
00ada97c	bl 0x00c38ca0
00ada980	mov x0,x20
00ada984	bl 0x00c38a20
00ada988	mov x0,x20
00ada98c	bl 0x00c38a30
00ada990	b 0x00ada7e0
00ada994	mov w1,#0x1
00ada998	mov x0,x22
00ada99c	bl 0x00c38fd0
00ada9a0	cbz w0,0x00ada948
00ada9a4	asr w8,w21,#0x1
00ada9a8	mov x0,x22
00ada9ac	sub w23,w8,#0x64
00ada9b0	bl 0x00c322f0
00ada9b4	cmp w0,w23
00ada9b8	b.le 0x00ada948
00ada9bc	mov x0,x19
00ada9c0	mov w1,w21
00ada9c4	mov x2,x20
00ada9c8	bl 0x00ada1c4
00ada9cc	cbz w0,0x00ada948
00ada9d0	mov x0,x19
00ada9d4	mov x1,x20
00ada9d8	bl 0x00ad9db4
00ada9dc	cbz w0,0x00ada948
00ada9e0	mov w19,#0x1
00ada9e4	b 0x00ada978
