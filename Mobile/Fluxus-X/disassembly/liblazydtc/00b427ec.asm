; ossl_prov_get_keymgmt_free @ 00b427ec
00b427ec	add x8,x0,#0x8
00b427f0	ldur w9,[x8, #-0x8]
00b427f4	cbnz w9,0x00b42808
00b427f8	b 0x00b42818
00b427fc	add x8,x8,#0x10
00b42800	ldur w9,[x8, #-0x8]
00b42804	cbz w9,0x00b42818
00b42808	cmp w9,#0xa
00b4280c	b.ne 0x00b427fc
00b42810	ldr x0,[x8]
00b42814	ret
00b42818	mov x0,xzr
00b4281c	ret
