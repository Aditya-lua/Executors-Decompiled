; ossl_ec_check_group_type_id2name @ 00a268d8
00a268d8	cbz w0,0x00a268f8
00a268dc	cmp w0,#0x4, LSL #12
00a268e0	b.eq 0x00a26900
00a268e4	cmp w0,#0x2, LSL #12
00a268e8	mov x0,xzr
00a268ec	b.ne 0x00a26914
00a268f0	mov w8,#0x1
00a268f4	b 0x00a26904
00a268f8	mov x8,xzr
00a268fc	b 0x00a26904
00a26900	mov w8,#0x2
00a26904	adrp x9,0xc5b000
00a26908	add x9,x9,#0x3d8
00a2690c	add x8,x9,x8, LSL #0x4
00a26910	ldr x0,[x8, #0x8]
00a26914	ret
