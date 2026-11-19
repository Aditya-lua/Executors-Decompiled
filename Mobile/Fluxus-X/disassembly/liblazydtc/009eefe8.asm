; ASN1_TIME_to_tm @ 009eefe8
009eefe8	str x19,[sp, #-0x20]!
009eefec	mov x19,x1
009eeff0	stp x29,x30,[sp, #0x10]
009eeff4	add x29,sp,#0x10
009eeff8	cbz x0,0x009ef010
009eeffc	ldp x29,x30,[sp, #0x10]
009ef000	mov x1,x0
009ef004	mov x0,x19
009ef008	ldr x19,[sp], #0x20
009ef00c	b 0x009ee624
009ef010	add x0,sp,#0x8
009ef014	bl 0x00c30970
009ef018	add x0,sp,#0x8
009ef01c	mov x1,x19
009ef020	stp xzr,xzr,[x19, #0x28]
009ef024	stp xzr,xzr,[x19, #0x18]
009ef028	stp xzr,xzr,[x19, #0x8]
009ef02c	str xzr,[x19]
009ef030	bl 0x00c37980
009ef034	ldp x29,x30,[sp, #0x10]
009ef038	cmp x0,#0x0
009ef03c	cset w0,ne
009ef040	ldr x19,[sp], #0x20
009ef044	ret
