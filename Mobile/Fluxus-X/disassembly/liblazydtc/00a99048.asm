; ossl_err_load_CRMF_strings @ 00a99048
00a99048	stp x29,x30,[sp, #-0x10]!
00a9904c	mov w0,#0x64
00a99050	movk w0,#0x1c00, LSL #16
00a99054	mov x29,sp
00a99058	bl 0x00c35520
00a9905c	cbnz x0,0x00a9906c
00a99060	adrp x0,0xc6b000
00a99064	add x0,x0,#0xc18
00a99068	bl 0x00c35510
00a9906c	mov w0,#0x1
00a99070	ldp x29,x30,[sp], #0x10
00a99074	ret
