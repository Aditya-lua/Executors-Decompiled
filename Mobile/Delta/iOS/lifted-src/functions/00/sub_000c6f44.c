/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6f44..0xc7168 (548 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6f44_0 {
    char field_0;
} st_c6f44_0;

extern long long g_cc1190;
extern long long g_cc1220;
extern long long g_cc1244;
extern long long g_cc144c;
extern long long g_cc14cc;
extern long long g_cc14ec;
extern long long g_cc15f4;
extern long long g_cc16c8;
extern long long g_cc1700;

long long sub_c6f44(long long a0, unsigned long long *a1, void* a2, long long a3)
{
    void* v6;  // x20
    unsigned long v7;  // x9
    unsigned long long v16;  // 4106
    long long v17;  // x19
    unsigned long long v18;  // x0
    unsigned long long v19;  // 4106
    unsigned long long v20;  // x0
    unsigned long long v21;  // 4106
    void* v8;  // x8
    unsigned long long v9;  // w21
    void* v10;  // x19
    long long v11;  // x0
    unsigned int v12;  // w24
    long long v13;  // x23
    long long v14;  // x25
    unsigned long long v15;  // x0
    long long v0;  // [bp-0x90], Other Possible Types: unsigned long
    long long v1;  // [bp-0x88]
    st_c6f44_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_c6f44_0 *v3;  // [bp-0x58]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = &v2;
    v2 = &v3;
    if (!a3)
        return -0x48;
    v6 = a2 + a3;
    v7 = *(char *)a2;
    v8 = a2 + 1;
    v9 = (unsigned int)v7 & 0xff;
    if (!(v7 >> 31 & 1))
    {
        *(unsigned int *)a1 = v9;
        if (!v9)
        {
LABEL_c7108:
            if (v8 == v6)
                v11 = a3;
            else
                v11 = -0x14;
            return v11;
        }
        goto LABEL_c6f90;
    }
    else if (v9 != 0xff)
    {
        if (a3 >= 2)
        {
            v8 = a2 + 2;
            v9 = ((char)a2[1] | v9 * 0x100) - 0x8000;
            *(unsigned int *)a1 = v9;
            if (!v9)
                goto LABEL_c7108;
LABEL_c6f90:
            v10 = v8 + 1;
            if (v6 >= v10)
                goto LABEL_c6f9c;
        }
    }
    else
    {
        if (a3 >= 3 && (v8 = a2 + 3, v9 = (short)a2[1] + 0x7f00, *(unsigned int *)a1 = v9, v10 = v8 + 1, v10 <= v6))
        {
LABEL_c6f9c:
            v12 = *(char *)v8;
            if (v12 & 3)
                return -0x14;
            v13 = a0 + 0x7000;
            v14 = a0 + 27324;
            *(int *)((char *)&v0 + 4) = *(int *)(v13 + 1532);
            v1 = v9;
            *(int *)&v0 = *(int *)(v13 + 1332);
            v15 = sub_c6cb4(a0 + 32, a0, v12 >> 6, 35, 9, v10, v6 - v10, &g_cc1190, &g_cc1220, &g_cc1244, v0, v1, v14);
            v16 = arm64g_calculate_condition(130, v15, 120, 0);
            if (!(v16 & 1))
            {
                v17 = v10 + v15;
                *(int *)((char *)&v0 + 4) = *(int *)(v13 + 1532);
                v1 = v9;
                *(int *)&v0 = *(int *)(v13 + 1332);
                v18 = sub_c6cb4(a0 + 4136, a0 + 16, __ROL__(v12, 28) & 4026531843 & 3, 31, 8, v17, v6 - v17, &g_cc144c, &g_cc14cc, &g_cc14ec, v0, v1, v14);
                v19 = arm64g_calculate_condition(130, v18, 120, 0);
                if (!(v19 & 1))
                {
                    *(int *)((char *)&v0 + 4) = *(int *)(v13 + 1532);
                    v1 = v9;
                    *(int *)&v0 = *(int *)(v13 + 1332);
                    v20 = sub_c6cb4(a0 + 6192, a0 + 8, __ROL__(v12, 30) & 0xc0000003 & 3, 52, 9, v17 + v18, v6 - (v17 + v18), &g_cc15f4, &g_cc16c8, &g_cc1700, v0, v1, v14);
                    v21 = arm64g_calculate_condition(130, v20, 120, 0);
                    if (!(v21 & 1))
                        return v17 + v18 + v20 - a2;
                }
            }
            return -0x14;
        }
    }
    return -0x48;
}
