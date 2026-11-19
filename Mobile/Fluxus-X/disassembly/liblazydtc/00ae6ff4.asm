; SRP_Verify_B_mod_N @ 00ae6ff4
00ae6ff4	str x23,[sp, #-0x40]!
00ae6ff8	stp x22,x21,[sp, #0x10]
00ae6ffc	mov w21,wzr
00ae7000	stp x20,x19,[sp, #0x20]
00ae7004	stp x29,x30,[sp, #0x30]
00ae7008	add x29,sp,#0x30
00ae700c	cbz x0,0x00ae707c
00ae7010	mov x22,x1
00ae7014	cbz x1,0x00ae707c
00ae7018	mov x23,x0
00ae701c	bl 0x00c38a50
00ae7020	cbz x0,0x00ae7060
00ae7024	mov x19,x0
00ae7028	bl 0x00c37710
00ae702c	mov x20,x0
00ae7030	cbz x0,0x00ae7068
00ae7034	mov x0,x20
00ae7038	mov x1,x23
00ae703c	mov x2,x22
00ae7040	mov x3,x19
00ae7044	bl 0x00c38f30
00ae7048	cbz w0,0x00ae7068
00ae704c	mov x0,x20
00ae7050	bl 0x00c369b0
00ae7054	cmp w0,#0x0
00ae7058	cset w21,eq
00ae705c	b 0x00ae706c
00ae7060	mov w21,wzr
00ae7064	b 0x00ae707c
00ae7068	mov w21,wzr
00ae706c	mov x0,x19
00ae7070	bl 0x00c38a30
00ae7074	mov x0,x20
00ae7078	bl 0x00c36290
00ae707c	mov w0,w21
00ae7080	ldp x29,x30,[sp, #0x30]
00ae7084	ldp x20,x19,[sp, #0x20]
00ae7088	ldp x22,x21,[sp, #0x10]
00ae708c	ldr x23,[sp], #0x40
00ae7090	ret
