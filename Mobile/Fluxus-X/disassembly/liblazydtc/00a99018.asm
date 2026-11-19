; ossl_err_load_CONF_strings @ 00a99018
00a99018	stp x29,x30,[sp, #-0x10]!
00a9901c	mov w0,#0x6e
00a99020	movk w0,#0x700, LSL #16
00a99024	mov x29,sp
00a99028	bl 0x00c35520
00a9902c	cbnz x0,0x00a9903c
00a99030	adrp x0,0xc6b000
00a99034	add x0,x0,#0xa58
00a99038	bl 0x00c35510
00a9903c	mov w0,#0x1
00a99040	ldp x29,x30,[sp], #0x10
00a99044	ret
