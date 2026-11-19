; ossl_ffc_params_FIPS186_2_generate @ 00a7ee94
00a7ee94	stp x20,x19,[sp, #-0x20]!
00a7ee98	mov x7,x6
00a7ee9c	mov x6,x5
00a7eea0	mov x5,x4
00a7eea4	mov w2,#0x1
00a7eea8	mov x4,x3
00a7eeac	stp x29,x30,[sp, #0x10]
00a7eeb0	add x29,sp,#0x10
00a7eeb4	mov x19,x1
00a7eeb8	bl 0x00a7e6f8
00a7eebc	cbz w0,0x00a7eed8
00a7eec0	mov w1,#0x4
00a7eec4	mov w2,#0x1
00a7eec8	mov x0,x19
00a7eecc	mov w20,#0x1
00a7eed0	bl 0x00c3dcb0
00a7eed4	b 0x00a7eedc
00a7eed8	mov w20,wzr
00a7eedc	ldp x29,x30,[sp, #0x10]
00a7eee0	mov w0,w20
00a7eee4	ldp x20,x19,[sp], #0x20
00a7eee8	ret
