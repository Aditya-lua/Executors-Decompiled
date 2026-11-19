; PEM_write_bio @ 00ab66a4
00ab66a4	sub sp,sp,#0x70
00ab66a8	stp x26,x25,[sp, #0x20]
00ab66ac	mov w26,#0x100
00ab66b0	stp x28,x27,[sp, #0x10]
00ab66b4	stp x24,x23,[sp, #0x30]
00ab66b8	stp x22,x21,[sp, #0x40]
00ab66bc	stp x20,x19,[sp, #0x50]
00ab66c0	stp x29,x30,[sp, #0x60]
00ab66c4	add x29,sp,#0x60
00ab66c8	mov x24,x4
00ab66cc	mov x25,x3
00ab66d0	mov x21,x2
00ab66d4	mov x22,x1
00ab66d8	mov x20,x0
00ab66dc	movk w26,#0xc, LSL #16
00ab66e0	bl 0x00c3cc10
00ab66e4	mov x19,x0
00ab66e8	cbz x0,0x00ab6840
00ab66ec	mov x0,x19
00ab66f0	bl 0x00c3cc40
00ab66f4	mov x0,x22
00ab66f8	bl 0x00c2ff50
00ab66fc	adrp x1,0x774000
00ab6700	mov x23,x0
00ab6704	add x1,x1,#0x44b
00ab6708	mov w2,#0xb
00ab670c	mov x0,x20
00ab6710	bl 0x00c34240
00ab6714	cmp w0,#0xb
00ab6718	b.ne 0x00ab6830
00ab671c	mov x0,x20
00ab6720	mov x1,x22
00ab6724	mov w2,w23
00ab6728	bl 0x00c34240
00ab672c	cmp w0,w23
00ab6730	b.ne 0x00ab6830
00ab6734	adrp x1,0x774000
00ab6738	add x1,x1,#0x457
00ab673c	orr w2,wzr,#0x6
00ab6740	mov x0,x20
00ab6744	bl 0x00c34240
00ab6748	cmp w0,#0x6
00ab674c	b.ne 0x00ab6830
00ab6750	cbz x21,0x00ab679c
00ab6754	mov x0,x21
00ab6758	bl 0x00c2ff50
00ab675c	mov x27,x0
00ab6760	cmp w27,#0x1
00ab6764	b.lt 0x00ab679c
00ab6768	mov x0,x20
00ab676c	mov x1,x21
00ab6770	mov w2,w27
00ab6774	bl 0x00c34240
00ab6778	cmp w0,w27
00ab677c	b.ne 0x00ab6830
00ab6780	adrp x1,0x2c4000
00ab6784	add x1,x1,#0xdae
00ab6788	mov w2,#0x1
00ab678c	mov x0,x20
00ab6790	bl 0x00c34240
00ab6794	cmp w0,#0x1
00ab6798	b.ne 0x00ab6830
00ab679c	adrp x1,0x2ce000
00ab67a0	add x1,x1,#0x16c
00ab67a4	mov w0,#0x2000
00ab67a8	mov w2,#0x27c
00ab67ac	bl 0x00c32320
00ab67b0	mov x21,x0
00ab67b4	cbz x0,0x00ab6844
00ab67b8	cmp x24,#0x1
00ab67bc	b.lt 0x00ab68b8
00ab67c0	mov w28,wzr
00ab67c4	mov w27,wzr
00ab67c8	mov w8,#0x1400
00ab67cc	cmp x24,x8
00ab67d0	csel x26,x24,x8,lt
00ab67d4	add x3,x25,w28, SXTW 
00ab67d8	add x2,sp,#0xc
00ab67dc	mov x0,x19
00ab67e0	mov x1,x21
00ab67e4	mov w4,w26
00ab67e8	bl 0x00c3cc50
00ab67ec	cbz w0,0x00ab6834
00ab67f0	ldr w2,[sp, #0xc]
00ab67f4	cbz w2,0x00ab6814
00ab67f8	mov x0,x20
00ab67fc	mov x1,x21
00ab6800	bl 0x00c34240
00ab6804	ldr w8,[sp, #0xc]
00ab6808	cmp w0,w8
00ab680c	b.eq 0x00ab6818
00ab6810	b 0x00ab6834
00ab6814	mov w0,wzr
00ab6818	sub x24,x24,w26, SXTW 
00ab681c	add w27,w0,w27
00ab6820	cmp x24,#0x0
00ab6824	add w28,w28,w26
00ab6828	b.gt 0x00ab67c8
00ab682c	b 0x00ab68bc
00ab6830	mov x21,xzr
00ab6834	mov w26,#0x7
00ab6838	movk w26,#0x8, LSL #16
00ab683c	b 0x00ab6844
00ab6840	mov x21,xzr
00ab6844	bl 0x00c342a0
00ab6848	adrp x0,0x2ce000
00ab684c	adrp x2,0x2ae000
00ab6850	add x0,x0,#0x16c
00ab6854	add x2,x2,#0x558
00ab6858	mov w1,#0x298
00ab685c	bl 0x00c342b0
00ab6860	mov w0,#0x9
00ab6864	mov w1,w26
00ab6868	mov x2,xzr
00ab686c	bl 0x00c342c0
00ab6870	mov w20,wzr
00ab6874	mov x0,x19
00ab6878	bl 0x00c3cc00
00ab687c	adrp x2,0x2ce000
00ab6880	add x2,x2,#0x16c
00ab6884	mov w1,#0x2000
00ab6888	mov w3,#0x29a
00ab688c	mov x0,x21
00ab6890	bl 0x00c345e0
00ab6894	mov w0,w20
00ab6898	ldp x29,x30,[sp, #0x60]
00ab689c	ldp x20,x19,[sp, #0x50]
00ab68a0	ldp x22,x21,[sp, #0x40]
00ab68a4	ldp x24,x23,[sp, #0x30]
00ab68a8	ldp x26,x25,[sp, #0x20]
00ab68ac	ldp x28,x27,[sp, #0x10]
00ab68b0	add sp,sp,#0x70
00ab68b4	ret
00ab68b8	mov w27,wzr
00ab68bc	add x2,sp,#0xc
00ab68c0	mov x0,x19
00ab68c4	mov x1,x21
00ab68c8	bl 0x00c3cc30
00ab68cc	ldr w2,[sp, #0xc]
00ab68d0	cmp w2,#0x1
00ab68d4	b.lt 0x00ab68f0
00ab68d8	mov x0,x20
00ab68dc	mov x1,x21
00ab68e0	bl 0x00c34240
00ab68e4	ldr w8,[sp, #0xc]
00ab68e8	cmp w0,w8
00ab68ec	b.ne 0x00ab6834
00ab68f0	adrp x1,0x774000
00ab68f4	add x1,x1,#0x45e
00ab68f8	mov w2,#0x9
00ab68fc	mov x0,x20
00ab6900	bl 0x00c34240
00ab6904	cmp w0,#0x9
00ab6908	b.ne 0x00ab6834
00ab690c	mov x0,x20
00ab6910	mov x1,x22
00ab6914	mov w2,w23
00ab6918	bl 0x00c34240
00ab691c	cmp w0,w23
00ab6920	b.ne 0x00ab6834
00ab6924	adrp x1,0x774000
00ab6928	add x1,x1,#0x457
00ab692c	orr w2,wzr,#0x6
00ab6930	mov x0,x20
00ab6934	bl 0x00c34240
00ab6938	cmp w0,#0x6
00ab693c	b.ne 0x00ab6834
00ab6940	ldr w8,[sp, #0xc]
00ab6944	adds w20,w8,w27
00ab6948	b.ne 0x00ab6874
00ab694c	b 0x00ab6834
