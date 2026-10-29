/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x960a40..0x960ed8 (1176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_960a40_0 {
    char padding_0[152];
    unsigned long long field_98;
} st_960a40_0;

typedef struct st_960a40_1 {
    unsigned int field_0;
    char padding_4[20];
    struct st_960a40_0 *field_18;
} st_960a40_1;

extern char g_d27ee0;
extern char g_d27f48;
extern char g_10002b0;

int sub_960a40(st_960a40_1 *a0, unsigned long long a1, unsigned long a2, unsigned long a3, unsigned long long a4)
{
    unsigned long v3;  // x8
    unsigned long long v4;  // x20
    unsigned long v5;  // x21
    unsigned long v6;  // x8
    unsigned long long v7;  // x19
    unsigned long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *(long long *)&g_10002b0;
    if (a0)
    {
        v3 = a0->field_0;
        v4 = a0;
        if (!(unsigned int)v3)
        {
LABEL_960a80:
            if (!a4)
                goto LABEL_960abc;
            goto LABEL_960ac4;
        }
        if (!(v3 >> 7 & 1))
        {
            v4 = 0;
            goto LABEL_960a80;
        }
        v4 = sub_980dc8();
        if (!a4)
        {
LABEL_960abc:
            if ((char)a0->field_0 < 0)
                goto LABEL_960e1c;
        }
LABEL_960ac4:
        if (v4)
        {
            v5 = (unsigned int)a1 - 33;
            if (103 >= (unsigned int)v5)
                goto *((void *)(sub_960af0 + (&g_d27ee0)[v5] * 4));
            if ((char)a0->field_0 >= 0)
            {
                v4 = a0;
                goto LABEL_960b64;
            }
            v6 = *(int *)v4;
            v7 = v4;
            if (!(unsigned int)v6)
            {
LABEL_960bc8:
                if (*(char *)v4 >= 0)
                {
                    if (!v7)
                        goto LABEL_960e90;
                    if (103 >= (unsigned int)v5)
                        goto *((void *)(sub_960af0 + (&g_d27f48)[v5] * 4));
LABEL_960b64:
                    if (*(long long *)&g_10002b0 == v0)
                        goto *((void *)(*(long long *)(*(long long *)(v4 + 24) + 152)));
                }
                else
                {
                    a0 = v4;
LABEL_960e1c:
                    if (*(long long *)&g_10002b0 == v0)
                        goto *((void *)(a0->field_18->field_98));
                }
            }
            else if (v6 >> 7 & 1)
            {
                v7 = sub_980dc8(v4);
                goto LABEL_960bc8;
            }
        }
LABEL_960e90:
        a0 = 0;
        goto LABEL_960e94;
    }
    else
    {
LABEL_960e94:
        if (*(long long *)&g_10002b0 == v0)
            return (unsigned int)a0;
        ___stack_chk_fail();
    }
}
