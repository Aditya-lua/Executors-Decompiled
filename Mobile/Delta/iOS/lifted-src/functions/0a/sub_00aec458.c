/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaec458..0xaec6c0 (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aec458_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_aec458_0 *field_8;
} st_aec458_1;

typedef struct st_aec458_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_aec458_0;

extern long long g_82031f;

unsigned long long sub_aec458(long long a0, void* a1)
{
    unsigned int v4;  // w9
    unsigned long v5;  // x0
    unsigned int v6;  // w0
    st_aec458_1 *v7;  // x9
    unsigned int v8;  // w8
    unsigned long long v0;  // [bp-0x30], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *(int *)a1;
    if ((int)v4 > 3)
    {
        if ((int)v4 > 5)
        {
            if (v4 == 6)
            {
LABEL_aec570:
                sub_9d524c(a0);
                sub_9c3708(a0, (long long)a1[8]);
            }
            else if (v4 == 7)
            {
                v5 = sub_af02d8(*(long long *)((long long)a1[8] + 8), *(int *)(long long)a1[8]);
                if (!v5)
                    return v5;
                v0 = v5;
                sub_9d524c(a0, "IP Address:%s");
                sub_a6c2e4(v5, "crypto/x509/v3_san.c", 290);
            }
            else if (v4 == 8)
            {
                sub_9d524c(a0, "Registered ID:");
                sub_9c3060(a0, (long long)a1[8]);
            }
            else
            {
                return 1;
            }
        }
        else
        {
            if (v4 != 4)
            {
                if (v4 != 5)
                    return 1;
LABEL_aec66c:
                sub_9d524c(a0);
            }
            else
            {
                sub_9d524c(a0, "DirName:");
                sub_9c3834(a0, (long long)a1[8], 0, &g_82031f);
            }
        }
        return 1;
    }
    if (1 >= (int)v4)
    {
        if (!v4)
        {
            v6 = sub_a99eac(*(long long *)(long long)a1[8]);
            v7 = *(long long *)((long long)a1[8] + 8);
            if (v6 == 1210)
            {
                if (v7->field_0 != 22)
                    goto LABEL_aec664;
                v0 = v7->field_8->field_0;
                v1 = v7->field_8->field_8;
                goto LABEL_aec66c;
            }
            else
            {
                if (v7->field_0 != 12)
                    goto LABEL_aec664;
                v8 = v6;
                if (1208 >= (int)v6)
                {
                    switch (v8)
                    {
                    case 649:
                        v0 = v7->field_8->field_0;
                        v1 = v7->field_8->field_8;
                        break;
                    case 1208:
                        v0 = v7->field_8->field_0;
                        v1 = v7->field_8->field_8;
                        break;
                    default:
LABEL_aec664:
                        break;
                    }
                    goto LABEL_aec66c;
                }
                else
                {
                    switch (v8)
                    {
                    case 1209:
                        v0 = v7->field_8->field_0;
                        v1 = v7->field_8->field_8;
                        break;
                    case 1211:
                        v0 = v7->field_8->field_0;
                        v1 = v7->field_8->field_8;
                        break;
                    default:
LABEL_aec664:
                        break;
                    }
                    goto LABEL_aec66c;
                }
            }
        }
        else if (v4 == 1)
        {
            goto LABEL_aec570;
        }
        else
        {
            return 1;
        }
    }
    else
    {
        if (v4 == 2)
        {
            goto LABEL_aec570;
        }
        else if (v4 == 3)
        {
            goto LABEL_aec66c;
        }
        else
        {
            return 1;
        }
    }
    goto LABEL_aec66c;
}
