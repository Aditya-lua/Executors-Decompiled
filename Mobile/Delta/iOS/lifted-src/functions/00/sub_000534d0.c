/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x534d0..0x538a4 (980 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_534d0_0 {
    char field_0;
} st_534d0_0;

extern unsigned long long g_e68c48;
extern unsigned long long g_e68dd0;
extern unsigned int g_f00d70;
extern unsigned int g_f00d80;
extern unsigned int g_f00d90;
extern unsigned int g_f00db0;
extern unsigned int g_f00dc0;
extern unsigned int g_f00dd0;
extern unsigned int g_f00e10;
extern unsigned int g_f00e20;
extern unsigned int g_f00e30;

void sub_534d0(unsigned int idx, long long a1, long long a2, unsigned int a3, long long a4, long long a5, long long a6)
{
    unsigned long long v16;  // x28
    unsigned long long v17;  // x27
    unsigned long long v26;  // x30
    unsigned int v27;  // w8
    unsigned int v28;  // x0
    unsigned long v29;  // x22
    unsigned int v30;  // x0
    unsigned long v31;  // x28
    unsigned long long v32;  // x26
    unsigned int v33;  // w27
    unsigned long long v34;  // x26
    unsigned int v35;  // w0
    unsigned long long v18;  // x26
    unsigned long long *v36;  // x25
    unsigned long long v19;  // x25
    unsigned long long v20;  // x24
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long v23;  // x21
    unsigned long long v24;  // x20
    unsigned long long v25;  // x19
    unsigned int v0;  // [bp-0x74]
    st_534d0_0 **v1;  // [bp-0x70], Other Possible Types: char
    st_534d0_0 *v2;  // [bp-0x68]
    unsigned long long v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = &v15;
    v14 = v26;
    v2 = &v1;
    v1 = &v2;
    v27 = *(int *)(idx + 8);
    if (!idx || v27 != g_f00d70)
    {
        if (idx && v27 == g_f00d80)
            goto *((void *)(g_e68dd0));
        if (idx && v27 == g_f00d90)
            goto *((void *)(g_e68dd0));
        if (idx && v27 == g_f00dc0)
        {
            if (*(long long *)(idx + 40))
            {
                v0 = 0;
                v31 = *(long long *)(idx + 32);
                v32 = *(long long *)(idx + 40) * 8;
                v33 = 0x100;
                do
                {
                    v34 = v32;
                    v35 = (unsigned long long)sub_534d0(*(long long *)v31, a1, a2, a3, a4, a5, a6);
                    if (!v35)
                    {
                        v0 = 1;
                    }
                    else
                    {
                        if (v33 == 0x100)
                        {
                            v33 = v35;
                        }
                        else
                        {
                            if (v33 != v35)
                                goto *((void *)(g_e68dd0));
                        }
                    }
                } while ((v31 += 8, v32 = v34 - 8, v34 != 8));
                if (v33 != 0x100)
                    goto *((void *)(g_e68dd0));
            }
        }
        else
        {
            if (!idx || v27 != g_f00dd0)
            {
                if (idx && v27 == g_f00e30)
                {
                    sub_534d0(*(long long *)(idx + 32), a1, a2, a3, a4, a5, a6);
                    goto *((void *)(g_e68dd0));
                }
                if (idx && v27 == g_f00db0)
                    goto *((void *)(g_e68dd0));
                if (v27 == g_f00e10)
                {
                    goto *((void *)(g_e68dd0));
                }
                else
                {
                    if (v27 == g_f00e20)
                        v36 = &g_e68dd0;
                    else
                        v36 = &g_e68c48;
                    goto *((void *)(*v36));
                }
            }
        }
    }
    else if (!(*(char *)(idx + 40) & 1))
    {
        v28 = sub_10160(a2, idx + 80);
        if (v28 && *(long long *)(v28 + 8))
        {
            if (sub_19204(a6, *(long long *)(v28 + 8) + 32))
            {
                sub_53b8c(a6, 32);
                goto *((void *)(g_e68dd0));
            }
            else
            {
                sub_1dcc4(a6, idx + 80);
                sub_1ac2c(a6, idx + 80);
                sub_534d0(*(long long *)(*(long long *)(v28 + 8) + 88), *(long long *)(v28 + 8) + 56, a2, a3, a4, a5, a6);
                goto *((void *)(g_e68dd0));
            }
        }
        v29 = *(long long *)(idx + 80);
        if (!(sub_528b4(*(long long *)(idx + 80), a1) & 1))
        {
            if (a3)
            {
                if (sub_1935c(idx + 80, a3) & 1)
                    goto *((void *)(g_e68dd0));
                else
                    v29 = *(long long *)(idx + 80);
            }
            if (sub_52d68(v29) == 0x100)
            {
                v30 = sub_10160(a4, idx + 80);
                if (v30)
                {
                    sub_31a80(a5, *(char *)(v30 + 8));
                    goto *((void *)(g_e68dd0));
                }
                else
                {
                    goto *((void *)(g_e68dd0));
                }
            }
            else
            {
                goto *((void *)(g_e68dd0));
            }
        }
    }
    goto *((void *)(g_e68dd0));
}
