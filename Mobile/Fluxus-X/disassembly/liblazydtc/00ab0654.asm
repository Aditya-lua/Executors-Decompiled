; ASN1_item_sign @ 00ab0654
00ab0654	sub sp,sp,#0x20
00ab0658	mov x7,x6
00ab065c	mov x6,x5
00ab0660	mov x5,xzr
00ab0664	stp x29,x30,[sp, #0x10]
00ab0668	add x29,sp,#0x10
00ab066c	stp xzr,xzr,[sp]
00ab0670	bl 0x00ab0680
00ab0674	ldp x29,x30,[sp, #0x10]
00ab0678	add sp,sp,#0x20
00ab067c	ret
