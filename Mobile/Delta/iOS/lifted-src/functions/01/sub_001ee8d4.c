/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ee8d4..0x1eea50 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ee8d4_1 {
    unsigned int field_0;
    unsigned int field_4;
} st_1ee8d4_1;

typedef struct st_1ee8d4_0 {
    char field_0;
} st_1ee8d4_0;

extern char g_10002b0;

unsigned long long sub_1ee8d4(void* a0)
{
    unsigned long long v8;  // x1
    unsigned int v9;  // w0
    unsigned int v18;  // w16
    unsigned int v19;  // w16
    unsigned int *v20;  // x15
    unsigned long v21;  // x8
    void* v22;  // x9
    unsigned long v23;  // x8
    void* v24;  // x9
    unsigned long v10;  // x8
    unsigned long i;  // x9
    st_1ee8d4_1 *v12;  // x10
    unsigned int *v13;  // x12
    unsigned int v14;  // w13
    unsigned int v15;  // w13
    void* iter;  // x14
    unsigned int *v17;  // x15
    st_1ee8d4_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_1ee8d4_0 *v1;  // [bp-0x50]
    char v2;  // [bp-0x48], Other Possible Types: unsigned long
    unsigned long v3;  // [bp-0x38]
    unsigned long v4;  // [bp-0x30]
    unsigned long v5;  // [bp-0x28]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if ((long long)a0[8])
    {
        if ((long long)a0[8] == 1)
        {
            v8 = *(int *)*(long long *)a0;
            if ((unsigned int)v8 == *(int *)(*(long long *)a0 + 4))
                goto LABEL_1eea20;
            v3 = 0;
            v4 = 0;
            v9 = sub_1eaa7c(&v2);
            v10 = (long long)a0[8];
            if ((long long)a0[8])
                goto LABEL_1ee95c;
        }
        else
        {
            v3 = 0;
            v4 = 0;
            v9 = sub_1eaa7c(&v2, *(int *)*(long long *)a0);
            v10 = (long long)a0[8];
            if ((long long)a0[8])
            {
LABEL_1ee95c:
                if (!v9)
                    goto LABEL_1eea20;
                i = 0;
                v12 = *(long long *)a0;
                do
                {
                    v13 = &v12[i].field_0;
                    v14 = *v13;
                    while (1)
                    {
                        v15 = v14;
                        iter = &v3;
                        v17 = &v2;
                        v18 = v9;
                        while (1)
                        {
                            v19 = v18;
                            v20 = v17 + 1;
                            if (v15 == *v17)
                                break;
                            iter += 4;
                            v18 = v19 - 1;
                            v17 = v20;
                            if (v19 == 1)
                                goto LABEL_1eea00;
                        }
                        *(unsigned int *)iter = 1;
                        v14 = v15 + 1;
                        if (v15 == v13[1])
                            break;
                    }
                    i += 1;
                } while (i != v10);
            }
        }
        if (v9)
        {
            v21 = v9;
            v22 = &v3;
            do
            {
                v23 = v21;
                v24 = v22 + 4;
                if (!*(int *)v22)
                    goto LABEL_1eea00;
            } while ((v21 = v23 - 1, v22 = v24, v23 != 1));
        }
        if (*(long long *)&g_10002b0 == v5)
            return (unsigned int)v2 | 0x200000;
    }
    else
    {
LABEL_1eea00:
        if (*(long long *)&g_10002b0 == v5)
            return 0xffffffff;
    }
    do
    {
        ___stack_chk_fail();
LABEL_1eea20:
    } while ((v8 = 0xffffffff, *(long long *)&g_10002b0 != v5));
    return v8;
}
