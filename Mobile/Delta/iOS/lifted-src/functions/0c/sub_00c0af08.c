/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0af08..0xc0b0c8 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0af08_0 {
    unsigned long long field_0[2];
    struct st_c0af08_1 *field_8;
} st_c0af08_0;

typedef struct st_c0af08_1 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
} st_c0af08_1;


unsigned long long sub_c0af08(uint128_t *a0, long long *a1)
{
    st_c0af08_0 *ptr;  // x0
    st_c0af08_0 *ptr1;  // x19
    unsigned long long *v5;  // x21
    unsigned long v6;  // x8
    unsigned long v7;  // x21
    unsigned long long *v8;  // x21
    unsigned long long v9;  // x20
    unsigned long v10;  // x8
    unsigned long v11;  // x8
    uint128_t v0;  // [bp-0x40], Other Possible Types: unsigned long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = *a0;
    ptr = _malloc(16);
    if (ptr)
    {
        ptr1 = ptr;
        v5 = *(unsigned long long *)&*(unsigned long long *)(void*)&v0;
        *(uint128_t *)ptr->field_0 = v0;
        if (sub_c06014(v5, a1) & 1)
            goto LABEL_c0afb0;
        if (*v5 != 10)
            goto LABEL_c0af9c;
        v6 = v5[4];
        v7 = v6 + 8;
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (/* unsupported instruction */)
            goto LABEL_c0b030;
        /* unsupported instruction */;
        if (!(/* unsupported instruction */ ^ 1))
            goto LABEL_c0af7c;
    }
    else
    {
        sub_c6ba70(8, 16);
LABEL_c0b030:
        /* unsupported instruction */;
    }
    v0 = v6;
    sub_c7573c(v6 + 8);
    v6 = v0;
LABEL_c0af7c:
    sub_c093f0(v6 + 40, *a1);
    do
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ != 1)
        {
            /* unsupported instruction */;
            sub_c75418(v7);
            break;
        }
    } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
LABEL_c0af9c:
    v8 = ptr1->field_0[1];
    if (sub_c06014(v8, a1) & 1)
    {
LABEL_c0afb0:
        v9 = 1;
    }
    else if (*v8 == 10)
    {
        v10 = v8[4];
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!/* unsupported instruction */)
        {
            /* unsupported instruction */;
            v11 = v10;
            if (!(/* unsupported instruction */ ^ 1))
                goto LABEL_c0affc;
        }
        else
        {
            /* unsupported instruction */;
        }
        v0 = v10;
        sub_c7573c(v10 + 8);
        v11 = v0;
LABEL_c0affc:
        sub_c093f0(v11 + 40, *a1);
        do
        {
            /* unsupported instruction */;
            if (/* unsupported instruction */ != 1)
            {
                /* unsupported instruction */;
                sub_c75418(v10 + 8);
                goto LABEL_c0b07c;
            }
        } while ((v9 = 0, /* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
    }
    else
    {
LABEL_c0b07c:
        v9 = 0;
    }
    _free(ptr1);
    return v9;
}
