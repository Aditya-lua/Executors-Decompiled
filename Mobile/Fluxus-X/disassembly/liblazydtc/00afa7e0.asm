; FUN_00afa7e0 @ 00afa7e0
00afa7e0	stp x28,x27,[sp, #-0x60]!
00afa7e4	stp x26,x25,[sp, #0x10]
00afa7e8	stp x24,x23,[sp, #0x20]
00afa7ec	stp x22,x21,[sp, #0x30]
00afa7f0	stp x20,x19,[sp, #0x40]
00afa7f4	stp x29,x30,[sp, #0x50]
00afa7f8	add x29,sp,#0x50
00afa7fc	cbz x1,0x00afa974
00afa800	mov x4,x3
00afa804	mov x20,x1
00afa808	adrp x1,0x2b8000
00afa80c	adrp x3,0x2ab000
00afa810	add x1,x1,#0x588
00afa814	add x3,x3,#0x32c
00afa818	mov w22,w2
00afa81c	mov x19,x0
00afa820	bl 0x00c32250
00afa824	ldr w8,[x20]
00afa828	cbz w8,0x00afa958
00afa82c	cmp w8,#0x1
00afa830	mov w0,wzr
00afa834	b.ne 0x00afa978
00afa838	ldr x0,[x20, #0x8]
00afa83c	bl 0x00c325e0
00afa840	cmp w0,#0x1
00afa844	b.lt 0x00afa974
00afa848	adrp x24,0x2ab000
00afa84c	adrp x25,0x2c2000
00afa850	adrp x26,0x2a7000
00afa854	adrp x27,0x2c2000
00afa858	mov w21,wzr
00afa85c	add w22,w22,#0x2
00afa860	add x24,x24,#0x32c
00afa864	add x25,x25,#0x4d4
00afa868	add x26,x26,#0x2d3
00afa86c	add x27,x27,#0x4ea
00afa870	ldr x0,[x20, #0x8]
00afa874	mov w1,w21
00afa878	bl 0x00c32610
00afa87c	ldr w8,[x0]
00afa880	mov x28,x0
00afa884	cmp w8,#0x1
00afa888	b.eq 0x00afa8c4
00afa88c	cbnz w8,0x00afa994
00afa890	ldr x1,[x28, #0x8]
00afa894	mov x0,xzr
00afa898	bl 0x00c3f730
00afa89c	cbz x0,0x00afa978
00afa8a0	mov x23,x0
00afa8a4	mov x0,x19
00afa8a8	mov x1,x27
00afa8ac	mov w2,w22
00afa8b0	mov x3,x24
00afa8b4	mov x4,x23
00afa8b8	bl 0x00c32250
00afa8bc	mov w2,#0x54
00afa8c0	b 0x00afa934
00afa8c4	ldr x8,[x28, #0x8]
00afa8c8	mov x0,xzr
00afa8cc	ldr x1,[x8]
00afa8d0	bl 0x00c3f730
00afa8d4	cbz x0,0x00afa978
00afa8d8	mov x23,x0
00afa8dc	adrp x1,0x2a8000
00afa8e0	mov x0,x19
00afa8e4	add x1,x1,#0x8d4
00afa8e8	mov w2,w22
00afa8ec	mov x3,x24
00afa8f0	mov x4,x23
00afa8f4	bl 0x00c32250
00afa8f8	mov w2,#0x5a
00afa8fc	mov x0,x23
00afa900	mov x1,x25
00afa904	bl 0x00c32310
00afa908	ldr x8,[x28, #0x8]
00afa90c	mov x0,xzr
00afa910	ldr x1,[x8, #0x8]
00afa914	bl 0x00c3f730
00afa918	cbz x0,0x00afa978
00afa91c	mov x23,x0
00afa920	mov x0,x19
00afa924	mov x1,x26
00afa928	mov x2,x23
00afa92c	bl 0x00c32250
00afa930	mov w2,#0x5e
00afa934	mov x0,x23
00afa938	mov x1,x25
00afa93c	bl 0x00c32310
00afa940	ldr x0,[x20, #0x8]
00afa944	add w21,w21,#0x1
00afa948	bl 0x00c325e0
00afa94c	cmp w21,w0
00afa950	b.lt 0x00afa870
00afa954	b 0x00afa974
00afa958	adrp x1,0x2da000
00afa95c	adrp x3,0x2ab000
00afa960	add w2,w22,#0x2
00afa964	add x1,x1,#0x684
00afa968	add x3,x3,#0x32c
00afa96c	mov x0,x19
00afa970	bl 0x00c32250
00afa974	mov w0,#0x1
00afa978	ldp x29,x30,[sp, #0x50]
00afa97c	ldp x20,x19,[sp, #0x40]
00afa980	ldp x22,x21,[sp, #0x30]
00afa984	ldp x24,x23,[sp, #0x20]
00afa988	ldp x26,x25,[sp, #0x10]
00afa98c	ldp x28,x27,[sp], #0x60
00afa990	ret
00afa994	mov w0,wzr
00afa998	b 0x00afa978
