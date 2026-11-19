; ASN1_parse @ 009f159c
009f159c	sub sp,sp,#0x20
009f15a0	mov w5,w3
009f15a4	str x1,[sp, #0x8]
009f15a8	add x1,sp,#0x8
009f15ac	mov w3,wzr
009f15b0	mov w4,wzr
009f15b4	mov w6,wzr
009f15b8	stp x29,x30,[sp, #0x10]
009f15bc	add x29,sp,#0x10
009f15c0	bl 0x009f15d0
009f15c4	ldp x29,x30,[sp, #0x10]
009f15c8	add sp,sp,#0x20
009f15cc	ret
