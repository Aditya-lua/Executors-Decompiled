; mbedtls_mpi_core_exp_mod_unsafe @ 00b851a4
00b851a4	sub sp,sp,#0x20
00b851a8	stp x29,x30,[sp, #0x10]
00b851ac	add x29,sp,#0x10
00b851b0	mov x8,x6
00b851b4	mov w6,#0x2a2a
00b851b8	movk w6,#0x2a2a, LSL #16
00b851bc	str x7,[sp]
00b851c0	mov x7,x8
00b851c4	bl 0x00b84e6c
00b851c8	ldp x29,x30,[sp, #0x10]
00b851cc	add sp,sp,#0x20
00b851d0	ret
