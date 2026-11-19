; ossl_rsa_check_prime_factor_range @ 00ad9fe0
00ad9fe0	str x23,[sp, #-0x40]!
00ad9fe4	stp x22,x21,[sp, #0x10]
00ad9fe8	stp x20,x19,[sp, #0x20]
00ad9fec	stp x29,x30,[sp, #0x30]
00ad9ff0	mov x20,x0
00ad9ff4	adrp x0,0xcb5000
00ad9ff8	ldr x0,[x0, #0x448]
00ad9ffc	add x29,sp,#0x30
00ada000	mov x19,x2
00ada004	asr w23,w1,#0x1
00ada008	bl 0x00c322f0
00ada00c	mov w22,w0
00ada010	mov x0,x20
00ada014	bl 0x00c322f0
00ada018	cmp w0,w23
00ada01c	mov w21,wzr
00ada020	b.ne 0x00ada0a0
00ada024	mov x0,x19
00ada028	bl 0x00c38a90
00ada02c	mov x0,x19
00ada030	bl 0x00c38a40
00ada034	mov x21,x0
00ada038	cbz x0,0x00ada098
00ada03c	adrp x1,0xcb5000
00ada040	ldr x1,[x1, #0x448]
00ada044	mov x0,x21
00ada048	bl 0x00c36990
00ada04c	cbz x0,0x00ada094
00ada050	sub w2,w23,w22
00ada054	tbnz w2,#0x1f,0x00ada080
00ada058	mov x0,x21
00ada05c	mov x1,x21
00ada060	bl 0x00c38fc0
00ada064	cbz w0,0x00ada094
00ada068	mov x0,x20
00ada06c	mov x1,x21
00ada070	bl 0x00c38cc0
00ada074	cmp w0,#0x0
00ada078	cset w21,gt
00ada07c	b 0x00ada098
00ada080	neg w2,w2
00ada084	mov x0,x21
00ada088	mov x1,x21
00ada08c	bl 0x00c39070
00ada090	cbnz w0,0x00ada068
00ada094	mov w21,wzr
00ada098	mov x0,x19
00ada09c	bl 0x00c38a20
00ada0a0	mov w0,w21
00ada0a4	ldp x29,x30,[sp, #0x30]
00ada0a8	ldp x20,x19,[sp, #0x20]
00ada0ac	ldp x22,x21,[sp, #0x10]
00ada0b0	ldr x23,[sp], #0x40
00ada0b4	ret
