/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc663e0..0xc66768 (904 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c663e0_0 {
    struct st_c663e0_0 *field_0;
    struct st_c663e0_0 *field_8;
    struct st_c663e0_0 *field_10;
    struct st_c663e0_0 *field_18;
    char padding_20[8];
    struct st_c663e0_0 *field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    struct st_c663e0_0 *field_40;
    char padding_48[8];
    unsigned long long field_50;
    char field_58;
} st_c663e0_0;

extern char g_d2da60;
extern char g_10002b0;

void sub_c663e0(st_c663e0_0 **a0, unsigned int a1, long long a2, unsigned long a3)
{
    unsigned long long v13;  // x26
    unsigned long long v14;  // x25
    st_c663e0_0 *v23;  // x0
    unsigned long long v24;  // x8
    unsigned long long v25;  // x8
    st_c663e0_0 *v26;  // x22
    st_c663e0_0 *v27;  // x8
    st_c663e0_0 *v28;  // x24
    st_c663e0_0 *iter;  // x19
    st_c663e0_0 *v30;  // x25
    st_c663e0_0 *v31;  // x9
    st_c663e0_0 *v32;  // x9
    unsigned long long v15;  // x24
    st_c663e0_0 *v33;  // x25
    st_c663e0_0 *v34;  // x11
    st_c663e0_0 *v35;  // x10
    st_c663e0_0 *n;  // x20
    st_c663e0_0 *v37;  // x10
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    st_c663e0_0 *v22;  // x21
    char v0;  // [bp-0x138]
    unsigned long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = &v12;
    v11 = v21;
    v1 = *(long long *)&g_10002b0;
    v22 = a0[8];
    if (v22)
    {
        if (a1 - 82 <= 12)
            goto *((void *)(sub_c664bc + *(&(&g_d2da60)[a1] - 82) * 4));
        switch (a1)
        {
        case 1:
            memset(&v22->field_18, 0, 24);
            goto LABEL_c6673c;
        case 2:
            if (!(int)a0[5])
                goto LABEL_c66734;
            if (v22->field_0)
                goto LABEL_c6673c;
            break;
        case 10:
            if ((int)a0[5])
            {
                if (v22->field_0)
                    v22 = v22->field_0->field_40;
                if (sub_a7c198(v22->field_50))
                {
                    v26 = 0;
                    v27 = v22->field_10;
                    v28 = v22->field_18;
                    iter = &v0;
                    v30 = 224;
                    v31 = v22->field_28;
                    v32 = v31;
                    do
                    {
                        v33 = v30;
                        v34 = v27 - v32;
                        v35 = v22->field_18;
                        if (v34 >= v35)
                            v34 = v35;
                        if (!v34)
                            break;
                        if (v34 < v33)
                            n = v34;
                        else
                            n = v33;
                        if (iter)
                        {
                            _memcpy(iter, v22->field_8 + v32, n);
                            v27 = v22->field_10;
                            v32 = v22->field_28;
                            if (v27 - v32 >= n)
                            {
                                v37 = v22->field_18;
                                if (v22->field_18 >= n)
                                {
                                    v32 += n;
                                    if (v32 == v27)
                                        v32 = 0;
                                    v22->field_28 = v32;
                                    v22->field_18 = v37 - n;
                                }
                            }
                            iter += n;
                        }
                        else
                        {
                            v32 += n;
                            if (v32 == v27)
                                v32 = 0;
                            v22->field_28 = v32;
                            v22->field_18 = v35 - n;
                        }
                        v26 += n;
                        v30 = v33 - n;
                    } while (v33 != n);
                    v22->field_28 = v31;
                    v22->field_18 = v28;
                    sub_a7c1b4(v22->field_50);
                    if (v26 == 224 || !v26)
                        goto LABEL_c6673c;
                }
            }
            break;
        case 41:
            goto LABEL_c6673c;
        case 140:
            if (sub_a7c17c(v22->field_50))
            {
                v24 = v22->field_10 - v22->field_18;
                if (223 < v24)
                    v24 -= 224;
                sub_a7c1b4();
                goto LABEL_c6673c;
            }
            break;
        case 137:
            goto LABEL_c6673c;
        case 136:
            if (v22->field_0)
            {
                sub_a368c8();
                sub_a369bc("crypto/bio/bss_dgram_pair.c", 465, "dgram_pair_ctrl_set_write_buf_size");
                sub_a36abc(32, 123, 0);
                break;
            }
            else
            {
                if (0x400 >= (unsigned long long)a2)
                    a2 = 0x400;
                v23 = v22;
                if (!v23->field_8 || sub_9d7e3c(&v23->field_8, a2))
                {
                    v22->field_30 = a2;
                    v22->field_58 = v22->field_58 & 247;
                    goto LABEL_c66734;
                }
            }
            break;
        case 42:
            v25 = a2 & 0xffffffff;
            v22->field_38 = v25;
            if (v22->field_0)
            {
                v22->field_0->field_40->field_38 = v25;
                goto LABEL_c66734;
            }
            break;
        case 11:
LABEL_c66734:
            goto LABEL_c6673c;
        default:
            break;
        }
    }
LABEL_c6673c:
    if (*(long long *)&g_10002b0 != v1)
        ___stack_chk_fail();
}
